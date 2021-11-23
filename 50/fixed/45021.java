@java.lang.Override
public void onResume() {
    super.onResume();
    if (paused) {
        paused = false;
    }
}