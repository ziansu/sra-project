public void calcDaysLeft() {
    java.util.Date currentDate;
    if ((expirationDate) != null) {
        java.util.Calendar c = java.util.Calendar.getInstance();
        currentDate = c.getTime();
        long delta = (expirationDate.getTimeInMillis()) - (currentDate.getTime());
        daysTillExp = delta / (((1000 * 60) * 60) * 24);
    }
}