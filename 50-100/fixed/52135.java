public static java.util.Date nextDue(com.androidandyuk.regularreminders.reminderItem o) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    try {
        c.setTime(com.androidandyuk.regularreminders.MainActivity.sdf.parse(o.completed.get(0)));
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    c.add(java.util.Calendar.DATE, o.frequency);
    java.util.Date resultDate = new java.util.Date(c.getTimeInMillis());
    return resultDate;
}