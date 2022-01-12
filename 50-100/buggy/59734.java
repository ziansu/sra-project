public void parse(final java.io.File rootFile) throws java.io.IOException {
    for (final java.io.File file : rootFile.listFiles()) {
        if (file.isDirectory()) {
            this.parse(file);
        }else {
            this.readFile(file);
        }
        this.setTotalDocuments(((this.getTotalDocuments()) + 1));
    }
}