@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    if ((currentPage) == 1) {
        showLoading();
    }
}