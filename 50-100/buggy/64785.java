public static java.util.Date convertDateString(java.lang.String strDateInDb) {
    java.util.Date date = new java.util.Date();
    try {
        date = com.example.jetty_jersey.db.Utility.df.parse(strDateInDb);
    } catch (java.text.ParseException e) {
        com.example.jetty_jersey.db.Utility.log.error(("Unrecognized date format (not yyyy/MM/dd HH:mm):" + strDateInDb));
    }
    return date;
}