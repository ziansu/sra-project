@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(org.quna.candybox.ViewGroup parent, int viewType) {
    if (viewType == (org.quna.candybox.ImageLayoutAdapter.VIEW_ITEM)) {
        org.quna.candybox.View v = org.quna.candybox.LayoutInflater.from(parent.getContext()).inflate(R.layout.thumbnail_card, parent, false);
        return new org.quna.candybox.ImageLayoutAdapter.ImageViewHolder(v);
    }else {
        org.quna.candybox.View v = org.quna.candybox.LayoutInflater.from(parent.getContext()).inflate(R.layout.progress_viewer, parent, false);
        return new org.quna.candybox.ImageLayoutAdapter.ProgressViewHolder(v);
    }
}