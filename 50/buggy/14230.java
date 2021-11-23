public void refreshNewsList(java.util.List<com.mihai.bean.News> newsList) {
    clear();
    addAll(newsList);
    notifyDataSetChanged();
}