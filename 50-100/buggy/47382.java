public int getIndexOfCurrentMonthInSemester() {
    java.util.Calendar current = java.util.Calendar.getInstance();
    int currentMonthOfYear = current.get(java.util.Calendar.MONTH);
    int index = ((11 - 7) + currentMonthOfYear) + 1;
    index = (index > 10) ? index - 12 : index;
    if (index <= 10) {
        return index;
    }
    return -1;
}