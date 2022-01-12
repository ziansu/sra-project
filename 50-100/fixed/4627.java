@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    com.example.ginji.rssfeed.NewsDAO news = new com.example.ginji.rssfeed.NewsDAO(mActivity);
    news.open();
    news.delete();
    if ((listItem) != null) {
        for (int i = 0; i < (listItem.size()); i++)
            news.insert(listItem.get(i));
        
    }
    return null;
}