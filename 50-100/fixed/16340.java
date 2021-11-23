@java.lang.Override
protected void onStartSearch(java.lang.String query) {
    if (!(de.tum.in.tumcampus.auxiliary.NetUtils.isConnected(this))) {
        showNoInternetLayout();
        return ;
    }
    showLoadingStart();
    new de.tum.in.tumcampus.models.managers.MVVJsoupParser(this).execute(new java.lang.String[]{ query });
}