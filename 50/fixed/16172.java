public void deleteTodo(final com.mad.achatz.fa_todo.ToDo todo) {
    if (connectionAvailable)
        new com.mad.achatz.fa_todo.TodoWebAccess.WebAccessTask("DELETE", null).execute(todo);
    
}