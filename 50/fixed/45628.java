public void appendItems(java.util.ArrayList<com.david.zhihudaily.zhihu.NewsModel> newslist) {
    mData.addAll(newslist);
    notifyDataSetChanged();
}