public boolean filterEvent(java.lang.String taskStartDate, java.lang.String taskEndDate) {
    if (findType.equals("DAY")) {
        java.lang.String formattedDate = formattedDateList.get(FORMATTED_DATE_INDEX);
        return isEventFound(formattedDate, taskStartDate, taskEndDate);
    }
    for (int day_index = STARTING_INDEX; day_index < (LAST_DAY_INDEX); day_index++) {
        java.lang.String formattedDate = formattedDateList.get(day_index);
        if (isEventFound(formattedDate, taskStartDate, taskEndDate)) {
            return TASK_FOUND;
        }
    }
    return TASK_NOT_FOUND;
}