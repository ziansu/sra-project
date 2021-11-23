public static boolean isValidDateStr(java.lang.String date) {
    try {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyyMMdd");
        sdf.setLenient(false);
        sdf.parse(date);
    } catch (java.text.ParseException e) {
        return false;
    } catch (java.lang.IllegalArgumentException e) {
        return false;
    }
    return true;
}