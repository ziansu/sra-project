@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.mustngo.newsp.News> items) {
    com.example.mustngo.newsp.NewsBox.get(getContext()).getNews();
    com.example.mustngo.newsp.NewsBox.get(getContext()).addNewsBox(items);
    com.example.mustngo.newsp.NewsBox.get(getContext()).saveNews();
    com.example.mustngo.newsp.NewsListFragment.NewsAdapter adapter = new com.example.mustngo.newsp.NewsListFragment.NewsAdapter(items);
    setListAdapter(adapter);
    Animation(true);
    IfNewsRefreshDone = true;
}