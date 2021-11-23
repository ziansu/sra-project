@java.lang.Override
protected void onPostExecute(java.lang.Object o) {
    ((com.hyperion.dashdroid.news.rss.RSSFragment) (com.hyperion.dashdroid.news.NewsModuleActivity.getCurrentSelectedItem().getFragment())).getAdapter().setFeed(((com.hyperion.dashdroid.news.rss.RSSFeed) (o)));
    ((com.hyperion.dashdroid.news.rss.RSSFragment) (com.hyperion.dashdroid.news.NewsModuleActivity.getCurrentSelectedItem().getFragment())).getAdapter().notifyDataSetChanged();
}