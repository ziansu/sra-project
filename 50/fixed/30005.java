@javax.jws.WebMethod(operationName = "existsProduct")
@javax.jws.WebResult(name = "return")
public boolean existsProduct(@javax.jws.WebParam(name = "productId")
java.lang.String productID) {
    if ((productID == null) || (productID.isEmpty())) {
        return false;
    }else {
        return true;
    }
}