com.itextpdf.kernel.pdf.PdfObjectStream getObjectStream() throws java.io.IOException {
    if (!(isFullCompression()))
        return null;
    
    if ((objectStream) == null) {
        objectStream = new com.itextpdf.kernel.pdf.PdfObjectStream(document);
    }else
        if ((objectStream.getSize()) == (PdfObjectStream.MAX_OBJ_STREAM_SIZE)) {
            objectStream.flush();
            objectStream = new com.itextpdf.kernel.pdf.PdfObjectStream(objectStream);
        }
    
    return objectStream;
}