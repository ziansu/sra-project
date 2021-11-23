@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.EditText title = ((android.widget.EditText) (root.findViewById(R.id.title)));
    task.setTitle(title.getText().toString());
    callback.onCreateTaskClicked(task);
}