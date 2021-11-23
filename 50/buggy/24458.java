@java.lang.Override
public void accept(@io.reactivex.annotations.NonNull
java.util.ArrayList<cn.edu.szu.szuschedule.object.TodoItem> TodoItems) throws java.lang.Exception {
    todoItems.addAll(TodoItems);
    adapter.notifyDataSetChanged();
}