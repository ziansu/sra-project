@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.EditText title = ((android.widget.EditText) (this.getActivity().findViewById(R.id.title)));
    task.setTitle(title.getText().toString());
    callback.onCreateTaskClicked(task);
}