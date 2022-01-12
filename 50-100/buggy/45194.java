public boolean removeTimer(com.napontaratan.vibernate.model.TimerSession timerSession) {
    if (timerSession != null) {
        timerController.removeAlarm(timerSession);
        timersIdMap.remove(timerSession.getId());
        timers.remove(timerSession);
        notifyListViewChanged();
        return true;
    }
    return false;
}