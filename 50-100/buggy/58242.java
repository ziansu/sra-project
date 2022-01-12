private taskey.logic.ProcessedObject updateToDeadline(taskey.logic.ProcessedObject processed, java.lang.String newDateRaw, java.lang.String newTaskName) {
    long epochTime;
    taskey.logic.Task changedTask = new taskey.logic.Task(newTaskName);
    changedTask.setTaskType("DEADLINE");
    if (!(specialDays.containsKey(newDateRaw))) {
        try {
            epochTime = timeConverter.toEpochTime(newDateRaw);
            changedTask.setDeadline(epochTime);
        } catch (java.text.ParseException error) {
            processed = parseError.processError(ParserConstants.ERROR_DATE_FORMAT);
            return processed;
        }
    }
    processed.setTask(changedTask);
    return processed;
}