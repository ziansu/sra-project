@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(isServiceRunning)) {
        updateUI(null);
    }
    updateService();
}