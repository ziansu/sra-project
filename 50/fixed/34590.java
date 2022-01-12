private java.lang.String convertDateForm(java.lang.String date) throws seedu.taskmanager.commons.exceptions.IllegalValueException {
    if (date.trim().matches(seedu.taskmanager.model.task.StartDate.STARTDATE_VALIDATION_REGEX2)) {
        date = seedu.taskmanager.commons.util.CurrentDate.getNewDate(date);
    }
    return date;
}