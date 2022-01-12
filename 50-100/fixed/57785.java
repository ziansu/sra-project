@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    int viewType = getItemViewType(position);
    if (viewType == (VIEW_TYPE_CONTENT)) {
        addContentView(holder);
    }else
        if (viewType == (VIEW_TYPE_LOADING)) {
            addLoadingView(holder);
        }
    
}