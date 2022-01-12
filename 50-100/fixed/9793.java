private java.util.Date parsePubdateDate(java.lang.String dateStr, boolean tryAllFormat) {
    long mNow = new java.util.Date().getTime();
    for (java.text.DateFormat format : com.rssreader.utils.TimeUtils.PUBDATE_DATE_FORMATS) {
        try {
            java.util.Date result = format.parse(dateStr);
            return (result.getTime()) > mNow ? new java.util.Date(mNow) : result;
        } catch (java.text.ParseException e) {
            android.util.Log.e(com.rssreader.utils.TimeUtils.TAG, "Wrong pubdate format");
        }
    }
    return tryAllFormat ? parseUpdateDate(dateStr, false) : null;
}