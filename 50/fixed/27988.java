public ScheduleHacks.OldCommand getFromRedoList() {
    ScheduleHacks.OldCommand getRedo = redoStack.pop();
    return getRedo;
}