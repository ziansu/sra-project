public void updateTimer(com.napontaratan.vibernate.model.TimerSession newTimer, com.napontaratan.vibernate.model.TimerSession oldTimer) throws com.napontaratan.vibernate.model.TimerConflictException {
    if (isTimerConflict(newTimer)) {
        throw new com.napontaratan.vibernate.model.TimerConflictException("Timer is in conflict with existing timers");
    }else {
        remove(oldTimer);
        timerController.updateDeviceState(newTimer, oldTimer);
        add(newTimer);
    }
}