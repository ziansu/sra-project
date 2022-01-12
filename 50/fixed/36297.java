@java.lang.SuppressWarnings(value = "deprecation")
public boolean isWeekend(java.util.Date d) {
    if ((weekends) == null)
        weekends = new boolean[7];
    
    return weekends[(((d.getDay()) + 6) % 7)];
}