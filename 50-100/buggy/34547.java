private void loadOffline() {
    clearList = true;
    newsList = com.orm.query.Select.from(com.golfapp.test.datafiles.NewsData.class).orderBy("updated DESC").list();
    for (int a = 0; a < (newsList.size()); a++) {
        newsList.get(a).imageList = com.orm.query.Select.from(com.golfapp.test.datafiles.ImageData.class).where(com.orm.query.Condition.prop("news_id").eq(newsList.get(a).newsID)).list();
    }
    setListView();
}