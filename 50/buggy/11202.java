public static void main(java.lang.String[] args) {
    WatkinsInfo watkinsInfo = new WatkinsInfo();
    try {
        watkinsInfo.createPdf("watkins.pdf");
    } catch (java.io.IOException | org.apache.pdfbox.exceptions.COSVisitorException e) {
        e.printStackTrace();
    }
}