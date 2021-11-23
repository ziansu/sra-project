private void writeToHD() throws java.io.FileNotFoundException, java.io.IOException {
    try (java.io.ObjectOutputStream outputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream(com.hit.memoryunits.HardDisk.DEAFAULT_FILE_NAME))) {
        outputStream.writeObject(pagesOnHD);
        outputStream.flush();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        logger.write(((e.getMessage()) + "\n"), java.util.logging.Level.SEVERE);
    }
}