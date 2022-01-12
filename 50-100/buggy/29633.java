public void addId(int id) {
    if ((this.oldIds.indexOf(id)) != (-1)) {
        return ;
    }
    this.oldIds.add(id);
    int placement = this.oldIds.indexOf(id);
    java.util.Timer nTimer = new java.util.Timer();
    nTimer.schedule(new appslattur.appslatturdemo.NotificationHandler.SpamHandler.SpamTimerTask(id), this.STANDARD_STORAGE_INTERVAL);
    this.timerTaskArray.add(placement, nTimer);
}