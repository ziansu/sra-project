private synchronized java.util.List<java.lang.String> getEchoMessagesFromReturnValue() {
    java.util.List<java.lang.String> returnListing = new java.util.ArrayList();
    for (T returnVal : this.returnValue) {
        if ((returnVal.getEcho()) == null) {
            continue;
        }
        returnListing.add(returnVal.getEcho());
    }
    return returnListing;
}