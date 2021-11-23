void processPaths(final java.util.List<java.lang.String> pdfPaths) {
    for (java.lang.String pdfPath : pdfPaths) {
        java.io.File file = new java.io.File(pdfPath);
        if (file.isDirectory()) {
            baseDirectory = file.getAbsolutePath();
            processDir(file);
        }else {
            processFile(file);
        }
    }
}