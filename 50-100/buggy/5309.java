public void search(java.lang.String strParams) {
    java.lang.String[] arrAllParams = strParams.split("&");
    addFilters();
    int t = container.size();
    if (t == 0) {
        container.removeAllContainerFilters();
        fetchData();
        addFilters();
    }
    tb.setContainerDataSource(container);
    t = container.size();
    if (t > 30) {
        t = 30;
    }
    tb.setPageLength(t);
}