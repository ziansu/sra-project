private boolean isExpired() {
    if (((expirationMonth) > 12) || ((expirationYear) < 1)) {
        return false;
    }
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(new java.util.Date());
    return ((cal.get(java.util.Calendar.YEAR)) > (expirationYear)) || (((cal.get(java.util.Calendar.YEAR)) == (expirationYear)) && ((cal.get(java.util.Calendar.MONTH)) >= (expirationMonth)));
}