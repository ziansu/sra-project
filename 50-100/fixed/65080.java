@java.lang.Override
protected void onStop() {
    super.onStop();
    mediacontroller.hide();
    mediaPlayer.stop();
    mediaPlayer.release();
    if (((bitmap) != null) && (!(bitmap.isRecycled()))) {
        bitmap = null;
    }
    java.lang.System.gc();
}