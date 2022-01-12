private void checkSubDirectories(java.io.File subDir) {
    if ((subDir.isDirectory()) && ((subDir.getName().length()) == (com.github.ukase.service.BulkRenderer.SUB_DIR_NAME_LENGTH))) {
        java.io.File[] pdfs = subDir.listFiles();
        if (pdfs == null) {
            return ;
        }
        java.util.Arrays.stream(pdfs).forEach(this::registerPdf);
    }
}