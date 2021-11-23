public java.lang.String formatXLSDate(org.apache.poi.ss.usermodel.Cell curCell, int c) {
    java.util.Date date = new java.util.Date();
    try {
        date = new java.text.SimpleDateFormat(columns.get(c).getDateType()).parse(curCell.toString());
    } catch (java.text.ParseException e) {
        return curCell.toString();
    }
    return new java.text.SimpleDateFormat(columns.get(c).getDateType()).format(date);
}