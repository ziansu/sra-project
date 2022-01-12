public void addNewListItem(java.lang.String pListName) {
    com.jakester.todolistchallenge.entities.UserList list = new com.jakester.todolistchallenge.entities.UserList(rowID, pListName);
    mToDoListsAdapter.addNewList(list);
    com.jakester.todolistchallenge.database.DatabaseManager.getInstance().addList(list);
    (rowID)++;
    com.jakester.todolistchallenge.utils.UtilFunctions.getInstance(this).setLastRowID(rowID);
}