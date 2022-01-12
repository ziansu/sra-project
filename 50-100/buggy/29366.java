private void processAlternativeColorSpace(com.itextpdf.text.pdf.PdfDictionary resources) {
    com.itextpdf.text.pdf.PdfDictionary csDictionary = resources.getAsDict(PdfName.COLORSPACE);
    if (csDictionary == null) {
        return ;
    }
    for (com.itextpdf.text.pdf.PdfName csName : csDictionary.getKeys()) {
        if ((csDictionary.getAsArray(csName)) != null) {
            csDictionary.put(csName, PdfName.DEVICEGRAY);
        }
    }
}