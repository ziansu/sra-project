public static boolean isAfterDate(java.lang.String firstDateString, java.lang.String secondDateString) {
    java.lang.System.out.println(((("firstDate : " + firstDateString) + ", seccondDate : ") + secondDateString));
    try {
        java.util.Date firstDate = th.co.gosoft.go10.util.DateUtils.dbFormat.parse(firstDateString);
        java.util.Date secondDate = th.co.gosoft.go10.util.DateUtils.dbFormat.parse(secondDateString);
        if (secondDate.after(firstDate)) {
            return true;
        }else {
            return false;
        }
    } catch (java.text.ParseException e) {
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
}