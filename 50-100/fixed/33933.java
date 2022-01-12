public void setHeaderView(android.view.View headerView) {
    if ((mHeaderView) != headerView) {
        if ((mHeaderView) == null) {
            mHeaderView = headerView;
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(getHeaderPosition());
        }else {
            if (headerView != null) {
                mHeaderView = headerView;
                com.livae.android.loading.RecyclerAdapter.notifyItemChanged(getHeaderPosition());
            }else {
                com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(getHeaderPosition());
                mHeaderView = null;
            }
        }
    }
}