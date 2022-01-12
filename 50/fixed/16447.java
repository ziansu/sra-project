public void OpenFQHandle() {
    try {
        fq1 = java.nio.file.Files.newBufferedWriter(fq1path, java.nio.charset.Charset.defaultCharset());
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
}