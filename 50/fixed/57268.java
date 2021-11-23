public boolean isValidDate(java.lang.String gameDate) {
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("MM/dd/yyyy");
    boolean result = true;
    try {
        dateFormat.parse(gameDate);
    } catch (java.text.ParseException e) {
        result = false;
    }
    return result;
}