private void readFromDisk() throws java.io.FileNotFoundException, java.io.IOException {
    java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.FileInputStream(DEFAULT_FILE_NAME));
    for (int i = 0; i < (_SIZE); i++) {
        try {
            this.pagesInDisk = ((java.util.HashMap<java.lang.Long, com.hit.memoryunits.Page<byte[]>>) (in.readObject()));
        } catch (java.lang.Exception e) {
        } finally {
            in.close();
        }
    }
}