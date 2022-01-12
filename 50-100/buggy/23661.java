public void loadComplete(org.vudroid.core.DecodeService decodeService) {
    this.decodeService = decodeService;
    this.documentPageCount = decodeService.getPageCount();
    this.pageWidth = decodeService.getPageWidth(0);
    this.pageHeight = decodeService.getPageHeight(0);
    state = com.joanzapata.pdfview.PDFView.State.LOADED;
    calculateOptimalWidthAndHeight();
    jumpTo(defaultPage);
    if ((onLoadCompleteListener) != null) {
        onLoadCompleteListener.loadComplete(documentPageCount);
    }
}