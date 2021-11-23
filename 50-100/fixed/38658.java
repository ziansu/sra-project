@java.lang.Override
public void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    int position = holder.getLayoutPosition();
    if ((isHeaderViewPos(position)) || (isFooterViewPos(position))) {
        android.view.ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();
        if ((lp != null) && (lp instanceof android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams)) {
            android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams p = ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (lp));
            p.setFullSpan(true);
        }
        super.onViewAttachedToWindow(holder);
    }else {
        mInnerAdapter.onViewAttachedToWindow(holder);
    }
}