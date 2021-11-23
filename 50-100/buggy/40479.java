@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.view.View view = recyclerView.findChildViewUnder(e.getX(), e.getY());
    int position = recyclerView.getChildPosition(view);
    com.codepath.todoapp.models.TodoItem todoItem = todoItems.get(position);
    todoItems.remove(position);
    todoAdapter.notifyDataSetChanged();
    db.deleteTodoItem(todoItem);
    super.onLongPress(e);
}