public void pagePlus() {
    int page = tableDrawer.getPage();
    if (page < (dm.getTm().getPageCount())) {
        tableDrawer.setPage((page + 1));
        setPageBtnState();
        setPageNrToField(page);
        draw();
    }
}