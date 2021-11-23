@java.lang.Override
public void onTimeChanged(android.widget.TimePicker view, int hourOfDay, int minute) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(java.util.Calendar.HOUR_OF_DAY, hourOfDay);
    calendar.set(java.util.Calendar.MINUTE, minute);
    proxy.setProperty("value", calendar.getTime());
    if (!(suppressChangeEvent)) {
        org.appcelerator.kroll.KrollDict data = new org.appcelerator.kroll.KrollDict();
        data.put("value", calendar.getTime());
        fireEvent("change", data);
    }
}