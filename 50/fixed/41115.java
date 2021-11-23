public void readIntoFromDefaultFile(tailminuseff.config.Configuration c) throws java.io.FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
    try (java.io.FileInputStream fin = new java.io.FileInputStream(this.file)) {
        readInto(fin, c);
    }
}