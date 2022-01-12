public int getFirstStep() {
    java.util.Calendar startDate = java.util.Calendar.getInstance();
    startDate.setTime(_startDatePicket.getDate());
    java.util.Calendar assignDate = java.util.Calendar.getInstance();
    assignDate.setTime(_projectAssignDate.toDate());
    long differenceFromStart = (startDate.getTimeInMillis()) - (assignDate.getTimeInMillis());
    return ((int) (differenceFromStart)) / ((60 * 60) * 1000);
}