private void recyclePreviousSlideView(int position, android.view.View view) {
    removeView(view);
    int viewType = adapter.getItemViewType(position);
    recycledViews.put(viewType, view);
    view.destroyDrawingCache();
    adapter.discardSlide(position);
    prepareSlide(getPlaylist().getNextSlide());
}