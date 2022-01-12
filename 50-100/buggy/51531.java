public boolean checkForBackToFuture(java.lang.String date) {
    java.util.Date _date = convertStringToDate(date);
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.util.Date today = cal.getTime();
    if (today.after(_date)) {
        return true;
    }
    return true;
}