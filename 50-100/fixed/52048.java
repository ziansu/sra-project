public void pagePlus() {
    int page = tableDrawer.getPage();
    if (page < (dm.getTm().getPageCount())) {
        page += 1;
        tableDrawer.setPage(page);
        setPageBtnState();
        setPageNrToField(page);
        draw();
    }
}