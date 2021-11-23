public java.lang.String getBeginString() {
    de.kjgbb.kaeseglockeapp.event.Event.DATE_FORMAT.setCalendar(begin);
    de.kjgbb.kaeseglockeapp.event.Event.TIME_FORMAT.setCalendar(begin);
    java.lang.StringBuffer strB = new java.lang.StringBuffer(de.kjgbb.kaeseglockeapp.event.Event.DATE_FORMAT.format(begin.getTime()));
    strB.append(" um ");
    strB.append(de.kjgbb.kaeseglockeapp.event.Event.TIME_FORMAT.format(begin.getTime()));
    strB.append(" Uhr");
    return strB.toString();
}