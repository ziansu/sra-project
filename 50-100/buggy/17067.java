public static java.lang.String readTextFromPdf(java.lang.String location, java.util.List<java.lang.Integer> pageNumbers) throws java.lang.Exception {
    java.io.File file = new java.io.File(location);
    java.lang.StringBuffer buff = new java.lang.StringBuffer();
    for (java.lang.Integer i : pageNumbers) {
        org.apache.pdfbox.pdmodel.PDDocument document = org.apache.pdfbox.pdmodel.PDDocument.load(file);
        org.apache.pdfbox.text.PDFTextStripper pdfStripper = new org.apache.pdfbox.text.PDFTextStripper();
        pdfStripper.setStartPage(1);
        pdfStripper.setEndPage(3);
        buff.append(pdfStripper.getText(document));
    }
    return buff.toString();
}