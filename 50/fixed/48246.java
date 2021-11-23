public void setContentBytes(byte[] contentBytes) {
    if (contentBytes == null) {
        contentBytes = new byte[0];
    }else {
        this.contentBytes = contentBytes;
    }
}