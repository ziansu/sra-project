private com.itextpdf.kernel.pdf.PdfArray getFormFields(com.itextpdf.kernel.pdf.PdfArray array) {
    com.itextpdf.kernel.pdf.PdfArray fields = new com.itextpdf.kernel.pdf.PdfArray();
    for (java.util.Iterator<com.itextpdf.kernel.pdf.PdfObject> iterator = array.directIterator(); iterator.hasNext();) {
        com.itextpdf.kernel.pdf.PdfDictionary field = ((com.itextpdf.kernel.pdf.PdfDictionary) (iterator.next()));
        com.itextpdf.kernel.pdf.PdfArray kids = field.getAsArray(PdfName.Kids);
        fields.add(field);
        if (kids != null) {
            fields.addAll(getFormFields(kids));
        }
    }
    return fields;
}