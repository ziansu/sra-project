@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_HEADER)) {
        return onCreateHeaderViewHolder(parent, viewType);
    }else
        if (viewType == (com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_FOOTER)) {
            return onCreateFooterViewHolder(parent, viewType);
        }
    
    return onCreateBasicItemViewHolder(parent, viewType);
}