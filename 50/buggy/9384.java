public void refresh() {
    threads = postFacade.GetByParentId(null);
    if ((threads) == null) {
        threads = new java.util.ArrayList<>();
    }
}