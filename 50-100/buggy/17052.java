@java.lang.Override
public it.telecomitalia.my.knot.KnotObjectListAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    int row_layout = (isHistory) ? R.layout.content_row_readed : R.layout.content_row_unreaded;
    android.view.View view = inflater.inflate(row_layout, parent, false);
    return new it.telecomitalia.my.knot.KnotObjectListAdapter.ViewHolder(view);
}