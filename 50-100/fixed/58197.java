@java.lang.Override
public com.example.sanket.newsapi.NewsAdapter.NewsAdapterViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int viewType) {
    context = viewGroup.getContext();
    int layoutIdForListItem = R.layout.news_layout_list;
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    boolean shouldAttachToParentImmediately = false;
    android.view.View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
    return new com.example.sanket.newsapi.NewsAdapter.NewsAdapterViewHolder(view);
}