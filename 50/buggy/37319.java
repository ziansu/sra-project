@java.lang.Override
public void onFailure(java.lang.Exception error) {
    android.util.Log.e(cs446.mezzo.art.AlbumArtManager.TAG, ("MusicBrainz failed " + (error.getMessage())));
    setDefaultCoverArt(view);
    paletteCallback.onFailure(error);
}