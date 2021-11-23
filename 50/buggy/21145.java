public void closeOutput() {
    try {
        this.outputStream.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}