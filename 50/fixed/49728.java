public void removeItem(int position) {
    reminder = reminders.get(position);
    dbHelper.deleteReminder(reminder);
    notifyItemRemoved(position);
    reminders = dbHelper.getAllReminders();
}