@java.lang.Override
public void taskAdded() {
    todo.setTodo_server_id(com.vector.model.TaskAdded.getInstance().id);
    tododao.insert(todo);
    editorAttach.clear().commit();
    editorComment.clear().commit();
    com.vector.onetodo.TaskListFragment.setAdapter(MainActivity.act, dayPosition, null);
    com.vector.onetodo.App.updateTaskList(MainActivity.act);
    if ((todo.getReminder().getLocation()) != null)
        addGeofence(todo);
    
    setAlarm();
}