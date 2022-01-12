public long getDaysRemaining() {
    java.util.Date date;
    date = new java.util.Date(this.getDateSet());
    return (this.getTotalDays()) - (this.differenceInDays(date, today, java.util.concurrent.TimeUnit.DAYS));
}