@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.thinkman.chinabestnews.NewsModel news = mAdapter.getItem(position);
    android.content.Intent intent = new android.content.Intent(this.getActivity(), com.thinkman.chinabestnews.activity.NewsActivity.class);
    intent.putExtra(NewsActivity.TITLE, news.getTitle());
    intent.putExtra(NewsActivity.URL, news.getUrl());
    this.getActivity().startActivity(intent);
}