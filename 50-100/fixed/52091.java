@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.EditText newListTitleEditText = ((android.widget.EditText) (dialog.findViewById(R.id.newListTitleEditText)));
    java.lang.String newListTitle = newListTitleEditText.getText().toString();
    if (newListTitle.isEmpty()) {
        android.widget.Toast.makeText(this, getText(R.string.toast_nothing_to_save), Toast.LENGTH_SHORT).show();
        dialog.dismiss();
    }else {
        toDoManagerSingleton.insertToDoList(this, newListTitle);
        listToDoListAdapter.notifyDataSetChanged();
        dialog.dismiss();
    }
}