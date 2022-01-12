private java.util.Date parsePubdateDate(java.lang.String dateStr, boolean tryAllFormat) {
    for (java.text.DateFormat format : com.rssreader.utils.TimeUtils.PUBDATE_DATE_FORMATS) {
        try {
            java.util.Date result = format.parse(dateStr);
            return (result.getTime()) > (mNow) ? new java.util.Date(mNow) : result;
        } catch (java.text.ParseException e) {
            android.util.Log.e(com.rssreader.utils.TimeUtils.TAG, "Wrong pubdate format");
        }
    }
    if (tryAllFormat)
        return parseUpdateDate(dateStr, false);
    else
        return null;
    
}