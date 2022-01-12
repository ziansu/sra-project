public void setCurrentInfo(test.homework.nick.snp20.events_for_eventbus.PlayerInfoEvent currentInfo) {
    this.currentInfo = currentInfo;
    playing = currentInfo.isPlaying();
    showNotification();
}