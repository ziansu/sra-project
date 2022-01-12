@java.lang.Override
public void onViewAttachedToWindow(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    super.onViewAttachedToWindow(holder);
    android.view.View itemView = holder.itemView;
    android.view.ViewGroup.LayoutParams lp = itemView.getLayoutParams();
    if (lp == null) {
        return ;
    }
    if ((holder instanceof com.super_zuo.study.BaseRefreshRecyclerViewAdapter.RefreshHeaderViewHolder) || (holder instanceof com.super_zuo.study.BaseRefreshRecyclerViewAdapter.RefreshFooterViewHolder)) {
        if (lp instanceof android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) {
            android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams p = ((android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams) (lp));
            p.setFullSpan(true);
        }
    }
}