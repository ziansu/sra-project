public void showBottomLoading(boolean show) {
    if ((mShowBottomLoading) != show) {
        mShowBottomLoading = show;
        if (show) {
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(getBottomLoadingPosition());
        }else {
            com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(getBottomLoadingPosition());
        }
    }
}