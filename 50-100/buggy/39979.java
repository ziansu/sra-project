public java.util.Date getDatePlusTime() {
    assert (date) != null;
    snaptask.parser.DateTime.calendar.setTime(date);
    snaptask.parser.DateTime.calendar.set(java.util.Calendar.HOUR, 0);
    snaptask.parser.DateTime.calendar.set(java.util.Calendar.MINUTE, 0);
    snaptask.parser.DateTime.calendar.add(java.util.Calendar.HOUR_OF_DAY, hr);
    snaptask.parser.DateTime.calendar.add(java.util.Calendar.MINUTE, min);
    return snaptask.parser.DateTime.calendar.getTime();
}