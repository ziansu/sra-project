private synchronized void writeToFile(char[] data) {
    try {
        this.outputFile.write(data);
        this.outputFile.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}