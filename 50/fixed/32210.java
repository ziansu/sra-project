@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    android.util.Log.i(com.example.android.uamp.ui.tv.MusicPlaybackOverlayFragment.TAG, "onCreate");
    super.onCreate(savedInstanceState);
    setFadingEnabled(true);
    setupRows();
}