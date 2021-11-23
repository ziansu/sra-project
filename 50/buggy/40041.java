@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    myHandler.removeCallbacks(UpdateSongTime);
    mp.release();
}