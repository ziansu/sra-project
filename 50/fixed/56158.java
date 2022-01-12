@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    layoutManager.smoothScrollToPosition(rvTripPhotos, null, adapter.getItemCount());
}