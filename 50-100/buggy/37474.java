@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((resultCode == (android.app.Activity.RESULT_OK)) && (requestCode == (com.app.leo.todolistapp.MainActivity.ADD_TODO_ITEM))) {
        com.app.leo.todolistapp.models.Todo todo = data.getParcelableExtra(ToDoEditActivity.KEY_TODO);
        updateTodoList(todo);
    }
}