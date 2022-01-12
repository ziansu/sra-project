@java.lang.Override
public void onFinish(java.util.List<com.dzy.done.bean.ListItem> items) {
    isLoading = false;
    if ((mView) == null)
        return ;
    
    if (items != null) {
        mDatas.addAll(items);
        mView.showDatas(mDatas);
        (page)++;
        android.util.Log.i("tag", (("presenter onFinish    items:" + (items.size())) + ""));
    }
    mView.hideProgress();
}