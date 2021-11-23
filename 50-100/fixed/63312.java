private byte[] getFileInBytes() {
    byte[] returnFile = new byte[1];
    try {
        java.io.FileInputStream file_in = new java.io.FileInputStream(this.inFile);
        returnFile = new byte[file_in.available()];
        file_in.read(returnFile);
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println("Cant find the input file:");
    } catch (java.io.IOException e) {
        java.lang.System.out.println("IO Problem in getFileInBytes");
    }
    return returnFile;
}