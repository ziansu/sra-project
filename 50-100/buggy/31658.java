@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.EMPTY_VIEW)) {
        android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.gene_empty_view, parent, false);
        com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.EmptyViewHolder viewHolder = new com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.EmptyViewHolder(view);
        return viewHolder;
    }
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gene, parent, false);
    com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.ViewHolder viewHolder = new com.maxleapmobile.gitmaster.ui.adapter.GeneAdapter.ViewHolder(view);
    view.setTag(viewHolder);
    return viewHolder;
}