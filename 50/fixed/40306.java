public com.example.lemon.hackernews.NewsObject getNews(int position) {
    if (position < (this.newsList.size()))
        return this.newsList.get(position);
    else
        return null;
    
}