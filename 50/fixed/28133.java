public static java.util.Date getOldestDay(java.util.Map<java.lang.String, java.lang.Double> data) {
    if ((data == null) || (data.isEmpty())) {
        return null;
    }else {
        return com.adiBlum.adiblum.myapplication.helpers.DatesHelper.findOldestDateInList(data);
    }
}