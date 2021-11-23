public void addDays(int days) {
    expirationDate = org.apache.commons.lang.time.DateUtils.addDays(expirationDate, days);
}