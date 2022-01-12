@java.lang.Override
public com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gene, parent, false);
    com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.ViewHolder viewHolder = new com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.ViewHolder(view);
    view.setTag(viewHolder);
    return viewHolder;
}