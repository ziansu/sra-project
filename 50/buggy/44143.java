@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if (playing) {
        stopLastSound();
    }
}