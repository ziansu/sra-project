public void setHeaderView(android.view.View headerView) {
    if ((mHeaderView) != headerView) {
        if ((mHeaderView) == null) {
            mHeaderView = headerView;
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(getHeaderPosition());
        }else {
            mHeaderView = headerView;
            if (headerView != null) {
                com.livae.android.loading.RecyclerAdapter.notifyItemChanged(getHeaderPosition());
            }else {
                com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(getHeaderPosition());
            }
        }
    }
}