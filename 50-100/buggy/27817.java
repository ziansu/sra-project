public void SetFilePath(java.lang.String pdfFilePath) {
    try {
        java.io.File file = new java.io.File(pdfFilePath);
        com.tom_roush.pdfbox.pdfparser.PDFParser parser = new com.tom_roush.pdfbox.pdfparser.PDFParser(file);
        parser.parse();
        com.tom_roush.pdfbox.cos.COSDocument cosDoc = parser.getDocument();
        pdfStripper = new com.tom_roush.pdfbox.text.PDFTextStripper();
        pdfStripper.setSortByPosition(true);
        pdDoc = new com.tom_roush.pdfbox.pdmodel.PDDocument(cosDoc);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}