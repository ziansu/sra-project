@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public void onItemClick(com.github.huajianjiang.baserecyclerview.viewholder.BaseViewHolder vh, android.view.View v, int adapterPosition) {
    onExpandableItemClick(this, v, ((T) (mAdapter.getParentForAdapterPosition(adapterPosition))), null, mAdapter.getParentPosition(adapterPosition), RecyclerView.NO_POSITION);
    if (v != (itemView))
        return ;
    
    if (mExpanded) {
        collapseParent();
    }else {
        expandParent();
    }
}