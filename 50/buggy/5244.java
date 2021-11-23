private void releaseContent(boolean close) {
    if (close) {
        super.releaseContent();
        try {
            indexStream.close();
        } catch (java.io.IOException e) {
            throw new com.itextpdf.kernel.PdfException(com.itextpdf.kernel.PdfException.IoException, e);
        }
        indexStream = null;
    }
}