@java.lang.Override
public void onResume() {
    super.onResume();
    if (isServiceRunning) {
        updateService();
    }
    updateUI(null);
}