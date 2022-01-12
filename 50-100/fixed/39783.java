@java.lang.Override
public br.com.wellington.find_it.Adapter.ListItemAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    android.view.View rootView = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, null, false);
    br.com.wellington.find_it.Adapter.ListItemAdapter.context = viewGroup.getContext();
    android.support.v7.widget.RecyclerView.LayoutParams lp = new android.support.v7.widget.RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    rootView.setLayoutParams(lp);
    return new br.com.wellington.find_it.Adapter.ListItemAdapter.ViewHolder(rootView);
}