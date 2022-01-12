@java.lang.Override
public java.lang.String toString() {
    java.lang.String timeString;
    try {
        timeString = getTaskDate().getTime().toString();
    } catch (java.lang.Exception e) {
        timeString = null;
    }
    return java.lang.String.format(Event.toStringFormat, getTaskID(), getTaskName(), getTaskLocation(), getTaskDescription(), timeString, getTaskPriority(), isDone(), isRecurring());
}