@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.v("PREPARED", "recieved prepared");
    setScreen();
    setPlayerControls();
    setSongProgressSeekbar();
    setAlbumCoverImage();
}