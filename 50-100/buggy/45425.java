@java.lang.Override
public final RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    switch (viewType) {
        case TYPE_BOTTOM :
            if ((loadMore) != null) {
                android.support.v7.widget.RecyclerView.ViewHolder holder = onBottomViewHolderCreate(loadMore);
                if (holder == null) {
                    throw new java.lang.RuntimeException("You must impl onBottomViewHolderCreate() and return your own holder ");
                }
                return holder;
            }else {
                return new com.lovejjfg.powerrecycle.holder.NewBottomViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_footer_new, parent, false), loadMoreListener);
            }
        default :
            return onViewHolderCreate(parent, viewType);
    }
}