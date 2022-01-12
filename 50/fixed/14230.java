public void refreshNewsList(java.util.List<com.mihai.bean.News> newsList) {
    clear();
    if (newsList == null) {
        return ;
    }
    addAll(newsList);
    notifyDataSetChanged();
}