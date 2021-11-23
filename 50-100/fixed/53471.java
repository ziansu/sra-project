@java.lang.Override
public org.droidplanner.android.widgets.adapterViews.LocatorItemAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    final android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_locator_list_item, parent, false);
    final android.widget.TextView timeView = ((android.widget.TextView) (view.findViewById(R.id.timeView)));
    return new org.droidplanner.android.widgets.adapterViews.LocatorItemAdapter.ViewHolder(view, timeView);
}