@java.lang.Override
public void onSuccess(java.util.List<com.personal.coine.scorpion.jxnuhelper.bean.News> list) {
    newsList = list;
    com.personal.coine.scorpion.jxnuhelper.adapter.NewsListAdapter adapter = new com.personal.coine.scorpion.jxnuhelper.adapter.NewsListAdapter(newsView.getFragmentContext(), list);
    newsView.getListView().setAdapter(adapter);
    newsView.getRefreshView().finishRefreshing();
}