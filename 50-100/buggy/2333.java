private java.util.ArrayList<Task> addReminder(java.lang.String[] inputs) {
    java.util.ArrayList<Task> returningTasks = new java.util.ArrayList<Task>();
    Task taskToAddReminder = getTaskToAddReminder(inputs);
    java.util.Date reminder = convertToDateObject(inputs[TaskManager.REMINDER_INDEX]);
    taskToAddReminder.addReminders(reminder);
    return returningTasks;
}