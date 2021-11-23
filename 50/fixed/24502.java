@java.lang.Override
public java.util.List<de.hauke_stieler.rednimer.Common.Material.Reminder> getAll(java.util.Calendar date) {
    java.lang.String dateString = _dateFormatter.format(date.getTime());
    return _reminderMap.get(dateString);
}