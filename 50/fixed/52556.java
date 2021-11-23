private void refreshDataset() {
    reminders = this.loadReminders();
    com.ferit.dfundak.georeminder.ReminderAdapter reminderAdapter = new com.ferit.dfundak.georeminder.ReminderAdapter(reminders);
    this.reminderList.setAdapter(reminderAdapter);
}