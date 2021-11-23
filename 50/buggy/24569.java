@java.lang.Override
public void setReminder(edu.ucsb.cs.cs185.xuanwangreminder.ReminderContent.Reminder reminder) {
    edu.ucsb.cs.cs185.xuanwangreminder.ReminderContent.addItem(reminder, getApplicationContext());
    edf.dismiss();
}