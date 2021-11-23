private long ConvertDateTimeToUnixTimestamp(org.eclipse.swt.widgets.DateTime time) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(time.getYear(), ((time.getMonth()) + 1), time.getDay());
    return (cal.getTime().getTime()) / ((long) (1000));
}