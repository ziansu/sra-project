@java.lang.Override
public void onStop() {
    super.onStop();
    if ((player) != null) {
        player.stop();
        player.release();
    }
}