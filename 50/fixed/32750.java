@java.lang.Override
public void toggleComplete() {
    if (!(this.isCompleted)) {
        todolist.model.task.CompleteTime completeTime = new todolist.model.task.CompleteTime(java.time.LocalDateTime.now());
        this.setCompleteTime(completeTime);
    }
    this.isCompleted = true;
}