public void run() {
    shadow.setNewCordList();
    if (shadow.whiteInMap()) {
        task.cancel();
        android.util.Log.i("System.out", "Finished!");
        updateMapOverview();
    }
    shadow.clearCordList();
    bitmap = shadow.calculateNewFrame();
    updateMapOverview();
}