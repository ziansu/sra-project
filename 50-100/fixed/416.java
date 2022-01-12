public boolean isDateInRange(java.util.Date d) {
    return (((startDate.before(d)) && (endDate.after(d))) || (startDate.equals(d))) || (endDate.equals(d));
}