public java.util.Calendar getNextTimeout() {
    java.util.Calendar now = new java.util.GregorianCalendar(this.timezone);
    now.setTime(new java.util.Date());
    return this.getNextTimeout(now);
}