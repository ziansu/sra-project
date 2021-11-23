@java.lang.Override
public void onViewAttachedToWindow(org.byteam.superadapter.internal.SuperViewHolder holder) {
    if ((isHeaderView(holder.getLayoutPosition())) || (isFooterView(holder.getLayoutPosition()))) {
        android.view.ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();
        if ((lp != null) && (lp instanceof android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams)) {
            ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (lp)).setFullSpan(true);
        }
    }
}