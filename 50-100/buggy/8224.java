void processPaths(final java.util.List<java.lang.String> pdfPaths) {
    if (pdfPaths.isEmpty()) {
        org.verapdf.report.ItemDetails item = org.verapdf.report.ItemDetails.fromValues("STDIN");
        processStream(item, java.lang.System.in);
    }
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