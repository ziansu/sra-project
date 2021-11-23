@java.lang.Override
public void onClick(android.view.View view) {
    com.example.developer.cleanarchitecture.Repository.Models.ToDoModel model = new com.example.developer.cleanarchitecture.Repository.Models.ToDoModel(((presenter.getMaxID()) + 1), title.getText().toString(), description.getText().toString(), presenter.getDate(), false, spinner.getSelectedItemPosition());
    presenter.addToDo(model);
    dialog.dismiss();
}