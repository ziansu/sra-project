public void setTimer(fi.jonne.javacliutils.core.utils.TimerInfo timerInfo) {
    fi.jonne.javacliutils.core.utils.TimerInfoContainer.timerInfos.put(timerInfo.id, timerInfo);
    saveTimers();
}