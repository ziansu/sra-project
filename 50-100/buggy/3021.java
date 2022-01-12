public void showTopError(boolean show) {
    if (((mShowTopError) != show) && (mErrorViewsCreator.hasTopErrorView())) {
        mShowTopError = show;
        if (show) {
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(getTopErrorPosition());
        }else {
            com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(getTopErrorPosition());
        }
    }
}