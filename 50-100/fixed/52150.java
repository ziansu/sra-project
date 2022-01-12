public boolean isPastEvent(java.lang.String endDate) {
    try {
        java.util.Date eventDate = org.onebrick.android.helpers.DateTimeFormatter.dateFormat.parse(endDate);
        java.util.Date currentDate = new java.util.Date();
        if (eventDate.before(currentDate)) {
            return true;
        }
    } catch (java.text.ParseException e) {
        android.util.Log.e(org.onebrick.android.helpers.DateTimeFormatter.TAG, ("cannot parse date: " + endDate));
    }
    return false;
}