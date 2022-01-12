public com.pushd.Message getToken() {
    java.lang.String res;
    try {
        this.client.getToken();
        res = this.client.read();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return new com.pushd.Message(Message.Status.timeOut, "timeout");
    }
    if (res == null)
        return null;
    
    return new com.pushd.Message(Message.Status.success, res);
}