private void addTodo(com.mad.achatz.fa_todo.ToDo toDo) {
    db.insertTodo(toDo);
    webAccess.createTodo(toDo);
    refreshList();
}