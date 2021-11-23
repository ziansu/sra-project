@java.lang.Override
public void buildRenderers(com.devbrackets.android.exomedia.exoplayer.EMExoPlayer player, com.devbrackets.android.exomedia.listener.RendererBuilderCallback callback) {
    this.player = player;
    this.callback = callback;
    com.google.android.exoplayer.hls.HlsPlaylistParser parser = new com.google.android.exoplayer.hls.HlsPlaylistParser();
    com.google.android.exoplayer.util.ManifestFetcher<com.google.android.exoplayer.hls.HlsPlaylist> playlistFetcher = new com.google.android.exoplayer.util.ManifestFetcher(uri, new com.google.android.exoplayer.upstream.DefaultUriDataSource(context, null, userAgent, true), parser);
    playlistFetcher.singleLoad(player.getMainHandler().getLooper(), this);
}