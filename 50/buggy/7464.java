public void clear() {
    mLastPosition = 0;
    visibleItems = new java.util.ArrayList<>();
    notifyDataSetChanged();
}