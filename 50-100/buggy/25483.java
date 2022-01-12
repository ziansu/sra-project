public void showBottomLoading(boolean show) {
    java.lang.System.out.println(("showBottomLoading " + show));
    if ((mShowBottomLoading) != show) {
        if (show) {
            mShowBottomLoading = true;
            int position = getBottomLoadingPosition();
            com.livae.android.loading.RecyclerAdapter.notifyItemInserted(position);
            java.lang.System.out.println(("show bottom loading true: " + position));
        }else {
            int position = getBottomLoadingPosition();
            mShowBottomLoading = false;
            com.livae.android.loading.RecyclerAdapter.notifyItemRemoved(position);
            java.lang.System.out.println(("show bottom loading false: " + position));
        }
    }
}