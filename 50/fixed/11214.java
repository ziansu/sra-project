public java.util.Date getStartDate() {
    if ((startDate) == null) {
        return null;
    }else {
        return org.apache.commons.lang3.time.DateUtils.truncate(startDate, java.util.Calendar.DATE);
    }
}