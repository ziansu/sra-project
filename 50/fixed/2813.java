@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
    if ((onSaveListener) != null) {
        task.name = mEditText.getText().toString();
        onSaveListener.onSave(task.id, task);
    }
}