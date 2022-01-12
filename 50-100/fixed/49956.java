public int getIndexOfCurrentWeekInSemester() {
    java.util.Calendar current = java.util.Calendar.getInstance();
    int currentWeekOfYear = current.get(java.util.Calendar.WEEK_OF_YEAR);
    int index = (18 + currentWeekOfYear) + 1;
    index = (index > 52) ? index - 52 : index;
    if (index <= 42) {
        return index;
    }
    return 42;
}