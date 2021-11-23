private synchronized void writeToFile(byte[] data) {
    try {
        this.outputFile.write(data);
        this.outputFile.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}