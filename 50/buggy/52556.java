private void refreshDataset() {
    java.util.ArrayList<com.ferit.dfundak.georeminder.reminderItem> reminders = this.loadReminders();
    com.ferit.dfundak.georeminder.ReminderAdapter reminderAdapter = new com.ferit.dfundak.georeminder.ReminderAdapter(reminders);
    this.reminderList.setAdapter(reminderAdapter);
}