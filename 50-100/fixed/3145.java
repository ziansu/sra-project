public void onClick(android.view.View button) {
    boolean selected = !(button.isSelected());
    button.setSelected(selected);
    userItem.setSelected(selected);
    if (selected) {
        userItem.setSelected(true);
    }
    com.dev.fondson.NoteLocker.Firebase.updateToDoItem(userItem);
}