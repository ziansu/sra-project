@java.lang.Override
public br.com.wellington.find_it.Adapter.ListItemAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
    @android.annotation.SuppressLint(value = "InflateParams")
    android.view.View rootView = android.view.LayoutInflater.from(br.com.wellington.find_it.Adapter.ListItemAdapter.context).inflate(R.layout.list_item, null, false);
    android.support.v7.widget.RecyclerView.LayoutParams lp = new android.support.v7.widget.RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    rootView.setLayoutParams(lp);
    return new br.com.wellington.find_it.Adapter.ListItemAdapter.ViewHolder(rootView);
}