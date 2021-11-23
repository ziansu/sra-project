@java.lang.Override
protected void onPause() {
    super.onPause();
    setScreenBrightness(byteshaft.com.recorder.VideoPlayer.Screen.Brightness.DEFAULT);
    videoView.stopPlayback();
}