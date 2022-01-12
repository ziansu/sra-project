@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int arg2, long arg3) {
    if ((arg2 > 0) && (arg2 <= (datalist.size()))) {
        net.mtjo.app.entity.FavoriteArticles article = datalist.get((arg2 - 1));
        if (null == article) {
            return ;
        }
        adapter.notifyDataSetChanged();
        net.mtjo.app.ui.base.WebViewActivity.ShareWebView(mContext, article.getUrl(), article.getTitle(), article.getTitle(), null);
    }
}