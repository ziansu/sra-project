public void onTextChanged(java.lang.CharSequence c, int start, int before, int count) {
    mTaskTitle = c.toString();
    com.bignerdranch.android.done.AppData.User.get().getList(listId).getTask(taskId).setTaskName(mTaskTitle);
}