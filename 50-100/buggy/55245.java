public void run() {
    shadow.setNewCordList();
    if (shadow.whiteInMap()) {
        task.cancel();
        android.util.Log.i("System.out", "Finished!");
        resetShadow();
    }
    shadow.clearCordList();
    bitmap = shadow.calculateNewFrame();
    updateMapOverview();
}