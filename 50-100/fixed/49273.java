private java.lang.String convertDate(java.lang.String date, java.lang.String original_format, java.lang.String converted_format) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(original_format);
    java.lang.String formatted_date = "";
    try {
        java.util.Date d = sdf.parse(date);
        sdf.applyPattern(converted_format);
        formatted_date = sdf.format(d);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Error formatting date");
    }
    return formatted_date;
}