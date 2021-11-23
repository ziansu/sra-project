@java.lang.Override
public void handle(javafx.event.ActionEvent e) {
    currentSearch = searchField.getText();
    textAreaNote.setText("");
    for (base.Folder f : noteBook.getFolders()) {
        if (f.getName().equals(currentFolder)) {
            matchedNotes = f.searchNotes(currentSearch);
            break;
        }
    }
    updateListView();
}