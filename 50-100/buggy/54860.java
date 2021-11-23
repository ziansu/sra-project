public java.lang.String receive() throws clientserver.exceptions.ConnectionException {
    java.lang.String receivedStr = "";
    java.lang.String tempStr;
    try {
        while ((tempStr = _in.readLine()) != null) {
            receivedStr += tempStr;
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
        throw new clientserver.exceptions.ConnectionException(Constants.SOCK_READERR);
    }
    return receivedStr;
}