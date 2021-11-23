@java.lang.Override
public void onDestroy() {
    if ((activePlayer) != null) {
        activePlayer.release();
    }
    MainActivity.YOrN = false;
    super.onDestroy();
}