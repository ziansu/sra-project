public boolean isExpired(java.util.Date invocationDate) {
    if ((getExpires()) != null) {
        java.util.Date date = (invocationDate == null) ? new java.util.Date() : invocationDate;
        return getExpires().before(date);
    }
    return false;
}