public boolean isExpired(java.util.Date invocationDate) {
    if ((getExpires()) != null) {
        if (invocationDate == null) {
            invocationDate = new java.util.Date();
        }
        return getExpires().before(invocationDate);
    }
    return false;
}