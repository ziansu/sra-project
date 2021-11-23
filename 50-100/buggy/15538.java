public cx.hell.android.pdfviewpro.BookmarkEntry toBookmarkEntry() {
    return new cx.hell.android.pdfviewpro.BookmarkEntry(decodeService.getPageCount(), documentView.getCurrentPage(), ((documentView.getZoomModel().getZoom()) * 1000), 0, documentView.getScrollX(), ((documentView.getScrollY()) - ((documentView.getHeight()) / 2)));
}