public ScheduleHacks.OldCommand getFromRedoList() {
    ScheduleHacks.OldCommand getRedo = redoStack.pop();
    addToUndoList(getRedo);
    return getRedo;
}