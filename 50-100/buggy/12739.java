private void handleDeletePlaylistEvent(android.net.Uri pUri) {
    com.dreamdigitizers.megamelodies.views.interfaces.IViewPlaylists view = this.getView();
    if (view != null) {
        int playlistId = java.lang.Integer.parseInt(pUri.getQueryParameter("playlistId"));
        java.util.HashMap transactions = this.mTransactionActions.get(ServicePlayback.CUSTOM_ACTION__DELETE_PLAYLIST);
        android.support.v4.media.MediaBrowserCompat.MediaItem mediaItem = ((android.support.v4.media.MediaBrowserCompat.MediaItem) (transactions.get(playlistId)));
        transactions.remove(playlistId);
        view.removeMediaItem(mediaItem);
    }
}