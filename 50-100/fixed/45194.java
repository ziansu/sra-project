public boolean removeTimer(com.napontaratan.vibernate.model.TimerSession timerSession) {
    if (timerSession != null) {
        timerController.removeAlarm(timerSession);
        timersIdMap.remove(timerSession.getId());
        for (com.napontaratan.vibernate.model.TimerSession t : timers) {
            if ((t.getId()) == (timerSession.getId())) {
                timers.remove(t);
                break;
            }
        }
        notifyListViewChanged();
        return true;
    }
    return false;
}