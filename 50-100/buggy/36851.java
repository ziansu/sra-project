private java.util.Date getRepeatStartDate(java.util.Date startDate, java.lang.String ptn) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(startDate);
    if (isView(cal.getTime(), ptn)) {
        return startDate;
    }else {
        cal.add(java.util.Calendar.DATE, 1);
        return getRepeatStartDate(cal.getTime(), ptn);
    }
}