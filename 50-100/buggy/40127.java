@java.lang.Override
public void onMoreArticles() {
    showProgressAnimations();
    if (checkConnection()) {
        (currentPage)++;
        (loaderId)++;
        isNewList = false;
        getLoaderManager().initLoader(loaderId, null, this);
    }else {
        refreshUI();
    }
}