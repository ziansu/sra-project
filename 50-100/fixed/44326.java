public void onFinish() {
    if (((towerPrimary) != null) && ((towerNeighbor) != null))
        initTowerListAdapter(towerPrimary, towerNeighbor);
    
    if ((wifis) != null) {
        setCurrentList(wifis);
        if ((urlConnection) == null) {
            doSubmitWifisTask(wifis);
        }
    }
    countDownTimer.start();
}