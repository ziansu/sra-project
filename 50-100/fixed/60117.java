@java.lang.Override
protected void onPostExecute(com.example.lemon.hackernews.NewsObject newsObject) {
    super.onPostExecute(newsObject);
    if (newsObject != null) {
        pbNews.setVisibility(View.GONE);
        mAdapter.addNews(newsObject);
        srlNews.setVisibility(View.VISIBLE);
    }else {
        pbNews.setVisibility(View.GONE);
        if (mAdapter.isEmpty())
            tvNoNetwork.setVisibility(View.VISIBLE);
        
    }
}