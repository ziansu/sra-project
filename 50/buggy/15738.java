public void setReminders(io.realm.RealmList<com.habitrpg.android.habitica.models.tasks.RemindersItem> reminders) {
    for (com.habitrpg.android.habitica.models.tasks.RemindersItem reminder : reminders) {
        reminder.setTask(this);
    }
    this.reminders = reminders;
}