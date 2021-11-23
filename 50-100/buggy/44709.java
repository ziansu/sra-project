public java.lang.String moveUpCommandHistory() {
    if ((((ScheduleHacks.History.indexOfCommand) <= 0) || ((commandHistory) == null)) || (commandHistory.isEmpty())) {
        ScheduleHacks.History.indexOfCommand = -1;
        return null;
    }else {
        (ScheduleHacks.History.indexOfCommand)--;
        return commandHistory.get(ScheduleHacks.History.indexOfCommand);
    }
}