@java.lang.Override
protected void getInitialData() {
    if ((mRoutes) != null) {
        showData(mRoutes.getRoutes());
        return ;
    }
    getData();
}