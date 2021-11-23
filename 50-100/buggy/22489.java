@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(parent.getContext());
    switch (viewType) {
        case com.ddmeng.zhihudaily.newslist.NewsListAdapter.VIEW_TYPE_TOP_NEWS :
            {
                android.view.View view = layoutInflater.inflate(R.layout.top_stories_view_holder, parent, false);
                return new com.ddmeng.zhihudaily.newslist.TopStoriesViewHolder(view, imageLoader);
            }
        case com.ddmeng.zhihudaily.newslist.NewsListAdapter.VIEW_TYPE_STORY :
            {
                android.view.View view = layoutInflater.inflate(R.layout.story_view_holder, parent, false);
                return new com.ddmeng.zhihudaily.newslist.StoryViewHolder(view, imageLoader, callback);
            }
    }
    return null;
}