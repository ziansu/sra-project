public void complete(javafx.event.ActionEvent actionEvent) {
    for (int i = 0; i < (fields.size()); i++) {
        note.setItem(com.hadjower.crudapp.model.Note.getColumnNames().get((i + 1)), fields.get(i).getValue());
    }
    hideWindow(actionEvent);
}