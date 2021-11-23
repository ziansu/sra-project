private void recyclePreviousSlideView(int position, android.view.View view) {
    removeView(view);
    int viewType = adapter.getItemViewType(position);
    recycledViews.put(viewType, view);
    view.destroyDrawingCache();
    if (view instanceof android.widget.ImageView) {
        ((android.widget.ImageView) (view)).setImageDrawable(null);
    }
    android.util.Log.d("SlideShowView", ("View added to recycling bin: " + view));
    adapter.discardSlide(position);
    prepareSlide(getPlaylist().getNextSlide());
}