public static java.lang.String getSortedDate(java.lang.String fromJson) {
    if ((fromJson == null) || (fromJson.equalsIgnoreCase("null"))) {
        return "0";
    }
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(com.omdb.rohksin.Mangoose.NewSearch.Utility.MovieUtils.JSON_DATE_FORMAT);
    java.util.Date d = null;
    try {
        d = sdf.parse(fromJson);
    } catch (java.text.ParseException e) {
    }
    sdf = new java.text.SimpleDateFormat(com.omdb.rohksin.Mangoose.NewSearch.Utility.MovieUtils.SORTABLE_DATE_FORMAT);
    java.lang.String ouput = sdf.format(d);
    return ouput;
}