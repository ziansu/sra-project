public void updateTimer(com.napontaratan.vibernate.model.TimerSession newTimer, com.napontaratan.vibernate.model.TimerSession oldTimer) throws com.napontaratan.vibernate.model.TimerConflictException {
    remove(oldTimer);
    if (isTimerConflict(newTimer)) {
        add(oldTimer);
        throw new com.napontaratan.vibernate.model.TimerConflictException("Timer is in conflict with existing timers");
    }else {
        timerController.updateDeviceState(newTimer, oldTimer);
        add(newTimer);
    }
}