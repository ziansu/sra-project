@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder holder, java.lang.Object item) {
    switch (holder.getItemViewType()) {
        case com.chad.library.adapter.base.BaseSectionQuickAdapter.SECTION_HEADER_VIEW :
            if ((holder.itemView.getLayoutParams()) instanceof android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) {
                android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams params = ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (holder.itemView.getLayoutParams()));
                params.setFullSpan(true);
            }
            convertHead(holder, ((T) (item)));
            break;
        default :
            convert(holder, ((T) (item)));
            break;
    }
}