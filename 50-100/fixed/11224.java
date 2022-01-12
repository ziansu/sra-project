@java.lang.Override
public void handle(se.kth.news.core.news.CheckNewsResponse newsMsg, se.sics.ktoolbox.util.network.KContentMsg<?, ?, se.kth.news.core.news.CheckNewsResponse> container) {
    java.util.ArrayList<se.kth.news.core.news.News> newsToAdd = container.getContent().getNews();
    for (se.kth.news.core.news.News n : newsToAdd) {
        if (!(news.contains(n))) {
            logReceivedNews(n);
        }
    }
}