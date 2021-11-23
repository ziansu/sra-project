public java.lang.String getBeginString() {
    java.lang.StringBuffer strB = new java.lang.StringBuffer(de.kjgbb.kaeseglockeapp.event.Event.DATE_FORMAT.format(begin.getTime()));
    strB.append(" um ");
    strB.append(de.kjgbb.kaeseglockeapp.event.Event.TIME_FORMAT.format(begin.getTime()));
    strB.append(" Uhr");
    return strB.toString();
}