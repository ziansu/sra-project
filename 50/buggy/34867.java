protected boolean isFree() {
    return (checkState(com.itextpdf.kernel.pdf.FREE)) || (checkState(com.itextpdf.kernel.pdf.ORIGINAL_OBJECT_STREAM));
}