public djangounchained.cartservice.ResponseClass addCart() {
    djangounchained.cartservice.ResponseClass response = new djangounchained.cartservice.ResponseClass();
    java.lang.String cartID = dynamo.scanCartExist(customerID, itemID);
    if ((cartID.length()) != 0) {
        dynamo.updateCart(cartID);
        response.setStatus("success");
        return response;
    }
    com.amazonaws.services.dynamodbv2.document.PutItemOutcome outcome = dynamo.addCart(customerID, itemID);
    if (outcome == null) {
        response.setStatus("fail");
    }else {
        response.setStatus("success");
    }
    return response;
}