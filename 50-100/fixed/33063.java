private static java.lang.Long itemID(int position) {
    android.util.Log.v("PlaylistAdapter", "itemID");
    org.bottiger.podcast.playlist.Playlist playlist = org.bottiger.podcast.playlist.Playlist.getActivePlaylist();
    org.bottiger.podcast.provider.IEpisode episode = playlist.getItem(position);
    if (episode == null)
        return -1L;
    
    java.lang.String url = episode.getUrl().toString();
    return ((long) (url.hashCode()));
}