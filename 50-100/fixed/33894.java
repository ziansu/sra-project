@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    com.google.sample.castcompanionlibrary.cast.player.VideoCastControllerFragment.sDialogCanceled = false;
    mCastController = ((com.google.sample.castcompanionlibrary.cast.player.IVideoCastController) (activity));
    mHandler = new android.os.Handler();
    try {
        mCastManager = com.google.sample.castcompanionlibrary.cast.VideoCastManager.getInstance(activity);
    } catch (com.google.sample.castcompanionlibrary.cast.exceptions.CastException e) {
    }
}