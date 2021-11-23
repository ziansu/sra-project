@java.lang.Override
public void onTodoUpdated(com.codepath.danbuscaglia.dbtodo.models.TodoItemTask updatedTodo) {
    itemsAdapter.notifyDataSetChanged();
}