public org.oucho.musicplayer.widgets.blurview.BlurView.ControllerSettings setupWith(@android.support.annotation.NonNull
android.view.ViewGroup rootView) {
    android.util.Log.w(org.oucho.musicplayer.widgets.blurview.BlurView.TAG_LOG, "setupWith()");
    org.oucho.musicplayer.widgets.blurview.BlurController blurController = new org.oucho.musicplayer.widgets.blurview.BlockingBlurController(this, rootView);
    setBlurController(blurController);
    if (!(isHardwareAccelerated())) {
        blurController.setBlurAutoUpdate(false);
    }
    return new org.oucho.musicplayer.widgets.blurview.BlurView.ControllerSettings(blurController);
}