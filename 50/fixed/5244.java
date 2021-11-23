@java.lang.Override
protected void releaseContent() {
    super.releaseContent();
    try {
        indexStream.close();
        indexStream = null;
    } catch (java.io.IOException e) {
        throw new com.itextpdf.kernel.PdfException(com.itextpdf.kernel.PdfException.IoException, e);
    }
}