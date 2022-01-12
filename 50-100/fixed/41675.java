private void combineActionPerformed(java.awt.event.ActionEvent evt) {
    com.tommontom.pdfsplitter.PdfMerge combiner = new com.tommontom.pdfsplitter.PdfMerge();
    java.io.File folder = new java.io.File(directoryField.getText());
    com.tommontom.pdfsplitter.FileNameFilter FileFilter = new com.tommontom.pdfsplitter.FileNameFilter();
    java.io.File[] files = folder.listFiles();
    for (int i = 0; i < (files.length); i++) {
        combiner.pdfMerge(files);
    }
}