@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    myHandler.removeCallbacks(UpdateSongTime);
    if ((mp) != null)
        mp.release();
    
}