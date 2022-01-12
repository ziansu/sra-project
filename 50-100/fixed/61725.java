private boolean isExpired() {
    if (((expirationMonth) > 12) || ((expirationYear) < 1)) {
        return true;
    }
    java.util.Calendar cal = java.util.Calendar.getInstance();
    return ((cal.get(java.util.Calendar.YEAR)) > (expirationYear)) || (((cal.get(java.util.Calendar.YEAR)) == (expirationYear)) && ((cal.get(java.util.Calendar.MONTH)) >= (expirationMonth)));
}