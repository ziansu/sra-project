@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent stopServiceIntent = new android.content.Intent(org.unhack.bip38decrypt.services.createService.STOP_SERVICE);
    createService.clearAllTasks();
    mProgressBar.setProgress(0);
    try {
        bip38service.getWorker().interrupt();
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    }
    if (bip38service.getWorker().isInterrupted()) {
        android.util.Log.d("CreateActivity", "thread was interrupted");
    }
    CreateActivity.createPagerAdapter.CoolNavigateToTab(0, CreateActivity.TABNUMBER, CreateActivity.createSwipeHandler, true);
}