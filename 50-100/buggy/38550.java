@java.lang.Override
public void onSystemUiVisibilityChange(int visibility) {
    if ((visibility & (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) == 0) {
        if (fullscreenMode) {
            deactivateFullscreen();
        }
        android.util.Log.d(cz.metaverse.android.bilingualreader.ReaderActivity.LOG, ((cz.metaverse.android.bilingualreader.ReaderActivity.LOG) + ".onSystemUiVisibilityChange - fullscreen cancelled"));
    }else {
        if (!(fullscreenMode)) {
            activateFullscreen();
        }
        android.util.Log.d(cz.metaverse.android.bilingualreader.ReaderActivity.LOG, ((cz.metaverse.android.bilingualreader.ReaderActivity.LOG) + ".onSystemUiVisibilityChange - fullscreen entered"));
    }
}