private static java.lang.String generateL2gFileName(java.lang.String lectureseriesNumber, java.lang.String container, java.lang.String l2gDateTime) {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd_HH-mm");
    java.lang.String newDate = format.format(new java.util.Date()).toString();
    if ((l2gDateTime.length()) > 0)
        newDate = l2gDateTime;
    
    java.lang.String ret = (((lectureseriesNumber + "_video_") + newDate) + ".") + container;
    ret = ret.toLowerCase();
    return ret;
}