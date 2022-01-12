@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((com.ashoksm.atozforkids.SliderActivity.MEDIA_PLAYER) != null) {
        com.ashoksm.atozforkids.SliderActivity.MEDIA_PLAYER.pause();
    }
    if ((timer) != null) {
        timer.cancel();
    }
}