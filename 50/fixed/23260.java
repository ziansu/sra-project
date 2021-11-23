private void addTaskFromForm(int minutesNum, java.lang.String taskName, java.lang.String taskDesc, java.lang.String urgencyType) {
    db.addTask(new drawapptutorial.com.example.thatwaseasy_twe.Task(minutesNum, taskName, taskDesc, urgencyType, "Not Complete", 0, false, 0));
}