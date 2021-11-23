public static java.lang.String dateToPGNDate(java.util.Date date) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.setTime(date);
    return ((((cal.get(java.util.Calendar.YEAR)) + ".") + (chesspresso.pgn.PGN.getRights(("00" + ((cal.get(java.util.Calendar.MONTH)) + 1)), 2))) + ".") + (chesspresso.pgn.PGN.getRights(("00" + (cal.get(java.util.Calendar.DAY_OF_MONTH))), 2));
}