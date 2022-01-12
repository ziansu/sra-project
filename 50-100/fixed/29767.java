public boolean filterDeadLine(java.lang.String taskStartDate) {
    if ("DAY".equals(findType)) {
        return (formattedDateList.get(FORMATTED_DATE_INDEX).compareTo(taskStartDate)) == (SAME_DAY_VALUE);
    }
    for (int day_index = STARTING_INDEX; day_index < (LAST_DAY_INDEX); day_index++) {
        if ((formattedDateList.get(day_index).compareTo(taskStartDate)) == (SAME_DAY_VALUE)) {
            return TASK_FOUND;
        }
    }
    return TASK_NOT_FOUND;
}