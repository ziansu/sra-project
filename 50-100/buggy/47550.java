@java.lang.Override
public void updateNews(com.ug.cyberCafe.domain.News news) {
    com.ug.cyberCafe.domain.News newsToUpdate = getNewsById(news.getIdNews());
    newsToUpdate.setTitle(news.getTitle());
    newsToUpdate.setBody(news.getBody());
    newsToUpdate.setUploadDate(news.getUploadDate());
    newsToUpdate.setUser(news.getUser());
    newsDao.updateNews(newsToUpdate);
}