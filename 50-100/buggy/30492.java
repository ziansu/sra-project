private void writeToHD() throws java.io.FileNotFoundException, java.io.IOException {
    try (java.io.ObjectOutputStream outputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream(com.hit.memoryunits.HardDisk.DEAFAULT_FILE_NAME))) {
        outputStream.writeObject(pagesOnHD);
        outputStream.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.String nextLine = java.lang.System.getProperty("line.seperator");
        logger.write(((e.getMessage()) + nextLine), java.util.logging.Level.SEVERE);
    }
}