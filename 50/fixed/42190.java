@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mController.setControllerMode(VideoControllerView.PAUSE_MODE);
    mController.show();
    mAnnotationTimer.stop();
}