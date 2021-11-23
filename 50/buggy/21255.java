@java.lang.Override
public void onRefresh() {
    scrollListener.resetState();
    if ((mFragPosition) != 0)
        mNetManager.downloadArticles(0, true, com.android.casopisinterfon.interfon.model.Category.getCategory(mFragPosition));
    else
        mNetManager.downloadArticles(0, true, null);
    
}