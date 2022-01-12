@java.lang.Override
public it.centotrenta.expridge.ListItemsAdapter.ListAdapterViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.content.Context context = parent.getContext();
    int layoutId = R.layout.custom_row;
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View view = inflater.inflate(layoutId, parent, false);
    return new it.centotrenta.expridge.ListItemsAdapter.ListAdapterViewHolder(view);
}