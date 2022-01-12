public boolean createNewList(java.lang.String listName) {
    if (databaseAccess.listNameValidity(listName)) {
        databaseAccess.open();
        databaseAccess.createGList(listName);
        databaseAccess.close();
        return true;
    }
    return false;
}