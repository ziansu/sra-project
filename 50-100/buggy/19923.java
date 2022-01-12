private boolean validateDate(java.util.Date value) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setLenient(false);
    cal.setTime(value);
    try {
        cal.getTime();
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}