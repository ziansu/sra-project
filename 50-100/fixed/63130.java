public static int getCourse(int startStudyYear) {
    java.util.Calendar startYear = java.util.Calendar.getInstance();
    startYear.set(java.util.Calendar.YEAR, startStudyYear);
    long yearStudy = startYear.getTimeInMillis();
    long today = java.lang.System.currentTimeMillis();
    long yearResult = today - yearStudy;
    startYear.setTimeInMillis(yearResult);
    int year = ((startYear.get(java.util.Calendar.YEAR)) + 1) - 1970;
    return year;
}