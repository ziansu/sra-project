public void setCurrentInfo(test.homework.nick.snp20.events_for_eventbus.PlayerInfoEvent currentInfo) {
    this.currentInfo = currentInfo;
    playing = currentInfo.isPlaying();
    android.util.Log.i("notification 111", ("playing is" + (playing)));
    showNotification();
}