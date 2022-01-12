public final void notifyParentItemChanged(int parentPosition) {
    com.jhj.expandablerecyclerview.model.ParentItem changedParentItem = mParentItems.get(parentPosition);
    if (changedParentItem == null)
        return ;
    
    int parentAdapterPos = getParentAdapterPosition(parentPosition);
    if (parentAdapterPos == (android.support.v7.widget.RecyclerView.NO_POSITION))
        return ;
    
    com.jhj.expandablerecyclerview.model.ParentItemWrapper parentItemWrapper = ((com.jhj.expandablerecyclerview.model.ParentItemWrapper) (getItem(parentAdapterPos)));
    parentItemWrapper.setParentItem(changedParentItem);
    com.jhj.expandablerecyclerview.adapter.ExpandableRecyclerViewAdapter.notifyItemChanged(parentAdapterPos);
}