public void displayPDF(org.apache.pdfbox.pdmodel.PDDocument aPDF) {
    pageList.setCellRenderer(new org.oganessian.scholarly.display.elements.pdf.PDFListRenderer(aPDF));
    org.apache.pdfbox.pdmodel.PDPageTree allPages = aPDF.getPages();
    javax.swing.DefaultListModel<org.apache.pdfbox.pdmodel.PDPage> thePages = new javax.swing.DefaultListModel<>();
    for (org.apache.pdfbox.pdmodel.PDPage aPage : allPages) {
        thePages.addElement(aPage);
    }
    pageList.setModel(thePages);
    pageList.addComponentListener(makeReizeListener());
}