public void showBottomLoading(boolean show) {
    if ((mShowBottomLoading) != show) {
        if (show) {
            mShowBottomLoading = true;
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(getBottomLoadingPosition());
        }else {
            com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(getBottomLoadingPosition());
            mShowBottomLoading = false;
        }
    }
}