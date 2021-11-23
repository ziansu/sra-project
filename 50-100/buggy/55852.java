@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.i("RVAdapter", ("Pointer: " + i));
    com.example.heetel.todo.TaskManager.setPointer(i);
    android.content.Intent intent = new android.content.Intent(view.getContext(), com.example.heetel.todo.DetailActivity.class);
    context.startActivity(intent);
    ((android.app.Activity) (view.getContext())).finish();
}