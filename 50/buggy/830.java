@java.lang.Override
public void onPause() {
    super.onPause();
    h.removeCallbacks(reactionGame);
    validPress = false;
}