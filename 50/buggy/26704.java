@java.lang.Override
public void onItemClick(android.view.View view, int position) {
    com.kong.app.news.beans.NewModel news = mAdapter.getItem(position);
    com.kong.app.news.NewsEntry.get().startBrowser(getContext(), news.newUrl, news.title);
}