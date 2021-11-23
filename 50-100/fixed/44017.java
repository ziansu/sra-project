public void changeLoadedPDFPreviewPage(int selectedIndex, int pageNum) throws java.io.IOException {
    if (pageNum < 1) {
        pageNum = 1;
    }else
        if (pageNum > (lNumPages)) {
            pageNum = lNumPages;
        }
    
    lPDFIcon = null;
    if (selectedIndex != (-1)) {
        lPDFIcon = new javax.swing.ImageIcon(loadedRenderer.renderImage((pageNum - 1)));
        curLPage = pageNum;
    }
    setChanged();
    notifyObservers();
}