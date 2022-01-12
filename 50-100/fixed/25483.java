public void showBottomLoading(boolean show) {
    if ((mShowBottomLoading) != show) {
        if (show) {
            mShowBottomLoading = true;
            int position = getBottomLoadingPosition();
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(position);
        }else {
            int position = getBottomLoadingPosition();
            mShowBottomLoading = false;
            com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(position);
        }
    }
}