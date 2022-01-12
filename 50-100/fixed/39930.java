void removeOutlines(com.itextpdf.kernel.pdf.PdfPage page) {
    if ((getDocument().getWriter()) == null) {
        return ;
    }
    if (hasOutlines()) {
        getOutlines(false);
        if ((pagesWithOutlines.size()) > 0) {
            if ((pagesWithOutlines.get(page.getPdfObject())) != null) {
                for (com.itextpdf.kernel.pdf.PdfOutline outline : pagesWithOutlines.get(page.getPdfObject())) {
                    outline.removeOutline();
                }
            }
        }
    }
}