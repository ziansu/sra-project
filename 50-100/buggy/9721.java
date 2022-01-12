private void setTaskTime(defaultPart.Task task, java.lang.String timeString) {
    defaultPart.Logic.logger.log(java.util.logging.Level.FINER, "Setting task time using \"{0}\"", timeString);
    java.lang.String[] startAndEndTime = timeString.split("-", 2);
    assert (startAndEndTime.length) > 0;
    task.setStartTime(getTimeFromString(startAndEndTime[0]));
    if ((startAndEndTime.length) == 2) {
        task.setEndTime(getTimeFromString(startAndEndTime[1]));
    }else {
        task.setEndTime(null);
    }
}