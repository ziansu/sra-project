public com.pushd.Message getToken() {
    java.lang.String res = null;
    try {
        this.client.getToken();
        res = this.client.read();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return new com.pushd.Message(Message.Status.timeOut, "timeout");
    }
    return new com.pushd.Message(Message.Status.success, res);
}