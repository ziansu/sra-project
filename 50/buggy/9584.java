public void pageMinus() {
    int page = tableDrawer.getPage();
    if (page > 0) {
        tableDrawer.setPage((page - 1));
        setPageBtnState();
        setPageNrToField(page);
        draw();
    }
}