@java.lang.Override
public void onMoreArticles() {
    isNewList = false;
    showProgressAnimations();
    if (checkConnection()) {
        (currentPage)++;
        (loaderId)++;
        getLoaderManager().initLoader(loaderId, null, this);
    }else {
        refreshUI();
    }
}