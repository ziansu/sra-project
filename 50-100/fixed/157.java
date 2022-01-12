private java.lang.StringBuilder handleDayChange(java.lang.String newDateString, java.lang.StringBuilder sb) {
    if (!(this.getLastExtractionDate().equals(newDateString))) {
        sb.append("\n");
        sb.append("*** ");
        sb.append(java.util.Calendar.getInstance().getDisplayName(java.util.Calendar.DAY_OF_WEEK, java.util.Calendar.LONG, java.util.Locale.ENGLISH));
        sb.append(" (");
        sb.append(newDateString);
        sb.append(") ***");
        sb.append("\n");
    }
    return sb;
}