public void nextPage() {
    if (((currentPage) + 1) < (maxPages)) {
        (currentPage)++;
        this.updateCanvas();
    }
}