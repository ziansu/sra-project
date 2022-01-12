private void renderPage(int pageNr) {
    this.pageConainer.getChildren().clear();
    this.pageConainer.getChildren().add(pages.get((pageNr - 1)));
    this.pageIndicator.setText(((("Page:" + (this.currentPage)) + "/") + (this.maxPage)));
}