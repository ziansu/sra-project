@java.lang.Override
protected void getInitialData() {
    if ((mCurrentLiveboard) == null) {
        getData();
    }else {
        showData(mCurrentLiveboard);
    }
}