public carelender.model.ReminderList getReminders() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    carelender.model.ReminderList reminderList = new carelender.model.ReminderList();
    while (!(reminders.isEmpty())) {
        if ((reminders.peek().getReTime().compareTo(cal)) == (-1)) {
            java.lang.System.out.println("Pop Reminder!");
            reminderList.add(reminders.poll());
        }else {
            break;
        }
    } 
    return reminderList;
}