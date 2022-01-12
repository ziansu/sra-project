public void onClick(android.view.View button) {
    boolean selected = !(button.isSelected());
    button.setSelected(selected);
    userItem.setSelected(selected);
    int intBool = 0;
    if (selected) {
        userItem.setSelected(true);
        intBool = 1;
    }
    com.dev.fondson.NoteLocker.Firebase.updateToDoItem(userItem);
}