public void onClick(android.content.DialogInterface dialog, int id) {
    java.lang.String userString = task.getText().toString();
    erica.todolist2.ToDo taskThing = new erica.todolist2.ToDo(userString, 0);
    al.set(i, taskThing);
    service.updateToDo(taskThing.getId(), taskThing);
    a.notifyDataSetChanged();
}