@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    android.util.Log.i("setUserVisibleHint", (((category) + ", isVisibleToUser:") + isVisibleToUser));
    super.setUserVisibleHint(isVisibleToUser);
    if (((((paintingListAdapter) != null) && ((paintingListAdapter.getItemCount()) == 0)) && isVisibleToUser) && (isVisible())) {
        android.util.Log.i("setUserVisibleHint", ((category) + " is loading."));
        galleryPresenter.loadPaintingList(category);
    }
}