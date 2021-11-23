private boolean isRSVPOpen(java.lang.String openDate) {
    try {
        java.util.Date rsvpOpenDate = org.onebrick.android.helpers.DateTimeFormatter.dateFormat.parse(openDate);
        java.util.Date currentDate = new java.util.Date();
        if (rsvpOpenDate.after(currentDate)) {
            return false;
        }
    } catch (java.text.ParseException e) {
        android.util.Log.e(org.onebrick.android.helpers.DateTimeFormatter.TAG, ("cannot parse date: " + openDate));
    }
    return true;
}