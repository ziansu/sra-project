@java.lang.Override
public void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mPosition = linearLayoutManager.findLastVisibleItemPosition();
    if ((mPosition) != 0)
        mPosition = (mPosition) - 1;
    
    newsAdapter = new com.digitalvm.vmnews.adapter.NewsAdapterRecycle(this);
    lv_news.setAdapter(newsAdapter);
    newsAdapter.setList(listNews);
    linearLayoutManager.scrollToPosition(mPosition);
}