private taskey.logic.ProcessedObject updateToDeadline(taskey.logic.ProcessedObject processed, java.lang.String newDateRaw) {
    long epochTime;
    taskey.logic.Task changedTask = new taskey.logic.Task();
    changedTask.setTaskType("DEADLINE");
    if (!(specialDays.containsKey(newDateRaw.toLowerCase()))) {
        try {
            epochTime = timeConverter.toEpochTime(newDateRaw.toLowerCase());
            changedTask.setDeadline(epochTime);
        } catch (java.text.ParseException error) {
            processed = parseError.processError(ParserConstants.ERROR_DATE_FORMAT);
            return processed;
        }
    }
    processed.setTask(changedTask);
    return processed;
}