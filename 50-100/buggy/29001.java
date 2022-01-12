public static java.util.Date getDate(com.toedter.calendar.JDateChooser jdc) {
    java.util.Date d = utilities.general.UTIL.clearTimeFields(jdc.getDate());
    if (((d == null) || ((utilities.general.UTIL.clearTimeFields(jdc.getMinSelectableDate()).compareTo(d)) > 0)) || ((utilities.general.UTIL.clearTimeFields(jdc.getMaxSelectableDate()).compareTo(d)) < 0)) {
        return null;
    }
    return d;
}