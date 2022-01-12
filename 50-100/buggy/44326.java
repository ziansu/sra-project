public void onFinish() {
    if (((towerPrimary) != null) && ((towerNeighbor) != null))
        initTowerListAdapter(towerPrimary, towerNeighbor);
    
    if ((wifis) != null) {
        boolean viewActiveFirst = false;
        if ((getCurrentResult()) == null) {
            setCurrentList(wifis);
            viewActiveFirst = true;
        }
        setCurrentList(wifis);
        if ((urlConnection) == null) {
            doSubmitWifisTask(wifis);
        }
    }
    countDownTimer.start();
}