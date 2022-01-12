public java.lang.Integer put(java.lang.String productName, java.lang.Integer productQuantity) {
    java.lang.Integer returnValue;
    if (containsKey(productName)) {
        returnValue = super.put(productName, ((get(productName)) + productQuantity));
    }else {
        returnValue = super.put(productName, productQuantity);
    }
    return returnValue;
}