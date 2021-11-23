@java.lang.Override
public void OnTodosRetrieved(java.util.List<com.mad.achatz.fa_todo.ToDo> toDoList) {
    for (com.mad.achatz.fa_todo.ToDo todo : toDoList) {
        db.insertTodo(todo);
    }
    refreshList();
}