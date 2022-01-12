private void checkMinutesSinceLastAction() {
    if ((stateMachine.getCurrent().getPomosDone()) > 0) {
        int localMinutesSinceLastAction = getMinutesSinceLastAction();
        if (localMinutesSinceLastAction > (minutesSinceLastAction)) {
            minutesSinceLastAction = localMinutesSinceLastAction;
        }
        if ((minutesSinceLastAction) >= (settings.getIdleTime())) {
            stateMachine.reset();
        }
    }
}