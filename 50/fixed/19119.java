public void setData(byte[] data) {
    responseData = data;
    if (data == null) {
        this.data = null;
        return ;
    }
    setData(new java.io.ByteArrayInputStream(data));
}