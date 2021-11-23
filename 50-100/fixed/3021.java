public void showTopError(boolean show) {
    if (((mShowTopError) != show) && (mErrorViewsCreator.hasTopErrorView())) {
        if (show) {
            mShowTopError = true;
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(getTopErrorPosition());
        }else {
            com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(getTopErrorPosition());
            mShowTopError = false;
        }
    }
}