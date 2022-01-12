@java.lang.Override
public void add(de.hauke_stieler.rednimer.Common.Material.Reminder reminder) {
    java.lang.String date = _dateFormatter.format(reminder.getDueDate().getTime());
    boolean keyAlreadyExists = _reminderMap.containsKey(date);
    if (!keyAlreadyExists) {
        _reminderMap.put(date, new java.util.ArrayList<>());
    }
    _reminderMap.get(date).add(reminder);
    de.hauke_stieler.rednimer.DayOverview.Service.ReminderAdded.fireEvent(new de.hauke_stieler.rednimer.Common.Material.Reminder[]{ reminder });
}