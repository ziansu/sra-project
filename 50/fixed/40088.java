public void removeLastCommandFromHistory() {
    if ((ScheduleHacks.History.indexOfCommand) > 0) {
        commandHistory.remove(((ScheduleHacks.History.indexOfCommand) - 1));
    }
}