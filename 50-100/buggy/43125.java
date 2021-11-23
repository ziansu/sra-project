public static java.lang.String getDateStringFromCalendar(java.util.Calendar calendar) {
    java.lang.String output = "";
    output += edu.rosehulman.keinslc.rhithmu.Utils.EventUtils.daysOfWeek[calendar.get(java.util.Calendar.DAY_OF_WEEK)];
    output += ", ";
    output += edu.rosehulman.keinslc.rhithmu.Utils.EventUtils.monthsOfYear[calendar.get(java.util.Calendar.MONTH)];
    output += ' ';
    output += calendar.get(java.util.Calendar.DAY_OF_MONTH);
    output += ", ";
    output += calendar.get(java.util.Calendar.YEAR);
    return output;
}