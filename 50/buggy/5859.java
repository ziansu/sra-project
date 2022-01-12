private void startScreenshots() {
    android.content.Intent intent = new android.content.Intent(this, csci435.csci435_odbr.SnapshotIntentService.class);
    int index = csci435.csci435_odbr.BugReport.getInstance().numEvents();
    intent.putExtra("index", index);
    startService(intent);
}