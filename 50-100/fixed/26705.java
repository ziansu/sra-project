public int getDate() {
    java.util.Calendar rightNow = java.util.Calendar.getInstance();
    int year = rightNow.get(java.util.Calendar.YEAR);
    int month = (rightNow.get(java.util.Calendar.MONTH)) + 1;
    int date = rightNow.get(java.util.Calendar.DATE);
    int timeKey = ((year * 10000) + (month * 100)) + date;
    return timeKey;
}