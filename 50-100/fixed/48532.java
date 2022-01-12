@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends com.bartoszrogowski.todolist.datamodel.TodoItem> observable, com.bartoszrogowski.todolist.datamodel.TodoItem oldValue, com.bartoszrogowski.todolist.datamodel.TodoItem newValue) {
    if (newValue != null) {
        com.bartoszrogowski.todolist.datamodel.TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        java.time.format.DateTimeFormatter df = java.time.format.DateTimeFormatter.ofPattern("MMMM d, yyyy");
        deadlineLabel.setText(df.format(item.getDeadline()));
    }
}