private void addTodo(com.mad.achatz.fa_todo.ToDo toDo) {
    db.insertTodo(toDo, false);
    webAccess.createTodo(toDo);
    refreshList();
}