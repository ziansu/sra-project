@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view;
    if (viewType == (com.johnbohne.close5interview.MainActivity.ImageViewAdapter.EMPTY_VIEW)) {
        view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_empty_view, parent, false);
        return new com.johnbohne.close5interview.MainActivity.ImageViewAdapter.EmptyViewHolder(view);
    }
    view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_image, parent, false);
    return new com.johnbohne.close5interview.MainActivity.ImageViewAdapter.ViewHolder(view);
}