@java.lang.Override
public void success(com.jpac.hackernews.data.News news, retrofit.client.Response response) {
    cachedNews.put(news.getId(), news);
    if (downloadQueue.isEmpty()) {
        displayNews();
    }else {
        downloadItemDetail();
    }
}