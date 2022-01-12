public void displayPDF(org.apache.pdfbox.pdmodel.PDDocument aPDF) {
    pageList.setCellRenderer(new org.oganessian.scholarly.display.elements.pdf.PDFListRenderer(aPDF));
    javax.swing.DefaultListModel<org.apache.pdfbox.pdmodel.PDPage> thePages = new javax.swing.DefaultListModel<>();
    pageList.setModel(thePages);
    org.apache.pdfbox.pdmodel.PDPageTree allPages = aPDF.getPages();
    for (org.apache.pdfbox.pdmodel.PDPage aPage : allPages) {
        thePages.addElement(aPage);
    }
    pageList.addComponentListener(makeReizeListener());
}