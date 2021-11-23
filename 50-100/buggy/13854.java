private void updateTaskFromForm(int id, int minutesNum, java.lang.String taskName, java.lang.String taskDesc, java.lang.String urgencyType, java.lang.String isComplete, int timerNum) {
    drawapptutorial.com.example.thatwaseasy_twe.Task updatedTask = new drawapptutorial.com.example.thatwaseasy_twe.Task(id, minutesNum, taskName, taskDesc, urgencyType, isComplete, timerNum, false);
    db.updateTask(updatedTask);
    updateListView();
}