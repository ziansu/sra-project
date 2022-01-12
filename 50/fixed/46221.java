private boolean changeTaskDate(java.lang.String descriptionSplit, defaultPart.TaskDate taskDate) {
    java.util.Calendar date = getDateFromString(descriptionSplit);
    if (date == null) {
        return false;
    }
    taskDate.setDate(date);
    return true;
}