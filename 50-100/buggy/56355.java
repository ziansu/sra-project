public void load() {
    if (((!(viewHolder.getVideoView().isAvailable())) || ((model) == null)) || (model.isInvalid()))
        return ;
    
    try {
        mediaPlayer.setDataSource(model.getUri());
        mediaPlayer.prepareAsync();
        viewHolder.showLoadingPlaceholder(true);
    } catch (java.io.IOException e) {
        android.util.Log.e(App.TAG, "Failed to load video", e);
    }
}