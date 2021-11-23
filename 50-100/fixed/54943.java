@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (VIEW_TYPE_ITEM)) {
        android.view.View view = android.view.LayoutInflater.from(this).inflate(R.layout.raw_content_friend, parent, false);
        return new com.walmart.android.activity.FriendsListViewActivity.UserViewHolder(view);
    }else
        if (viewType == (VIEW_TYPE_LOADING)) {
            android.view.View view = android.view.LayoutInflater.from(this).inflate(R.layout.layout_loading_item, parent, false);
            return new com.walmart.android.activity.FriendsListViewActivity.LoadingViewHolder(view);
        }
    
    return null;
}