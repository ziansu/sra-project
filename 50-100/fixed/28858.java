@java.lang.Override
public void onPause() {
    super.onPause();
    if (((task) == null) || ((mCallback) == null)) {
        return ;
    }
    task.setTask(taskDescription.getEditableText().toString());
    mCallback.onTaskUpdated(task);
}