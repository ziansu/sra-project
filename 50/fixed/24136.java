public void setOutputStream(java.io.FileOutputStream outputStream) {
    this.outputStream = outputStream;
    channel = outputStream.getChannel();
}