private void renderPage(int pageNr) {
    this.pageConainer.getChildren().clear();
    this.pageConainer.getChildren().add(pages.get(pageNr));
    this.pageIndicator.setText(((("Page:" + (this.currentPage)) + "/") + (this.maxPage)));
}