@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unbinder.unbind();
    releasePersonality();
    releaseVisualizer();
    com.huhx0015.hxgselib.audio.HXGSEMusicEngine.getInstance().releaseMedia();
}