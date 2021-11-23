@java.lang.Override
public void onResume() {
    super.onResume();
    if (paused) {
        setController();
        paused = false;
    }
}