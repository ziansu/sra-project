@java.lang.Override
public gruppnan.timeline.controller.ItemListAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    mContext = parent.getContext();
    ilav = new gruppnan.timeline.view.ItemListAdapterView();
    android.view.View v = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_timeline, parent, false);
    gruppnan.timeline.controller.ItemListAdapter.ViewHolder vh = new gruppnan.timeline.controller.ItemListAdapter.ViewHolder(v, viewType);
    return vh;
}