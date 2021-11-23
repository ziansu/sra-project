public static int processActionsInEvent(ru.runa.wfe.lang.ActionEvent actionEvent) {
    int result = 0;
    for (ru.runa.wfe.lang.Action action : actionEvent.getActions()) {
        if (((action instanceof ru.runa.wfe.lang.jpdl.CreateTimerAction) || (action instanceof ru.runa.wfe.lang.jpdl.CancelTimerAction)) || (((action.getName()) != null) && (action.getName().contains(TimerJob.ESCALATION_NAME)))) {
            continue;
        }
        result++;
    }
    return result;
}