public void removeItem(int position, net.giancarlofusiello.reminders.Reminder reminder) {
    dbHelper.deleteReminder(reminder);
    notifyItemRemoved(position);
    reminders = dbHelper.getAllReminders();
}