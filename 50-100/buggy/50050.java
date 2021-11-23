private boolean isUnique(db.User user) {
    db.UserStorageDatabaseHelper.UserCursor cursor = queryUsers();
    boolean isUnique = true;
    while (cursor.moveToNext()) {
        if (cursor.getUser().getEmail().matches(user.getEmail())) {
            isUnique = false;
            break;
        }
    } 
    cursor.close();
    return isUnique;
}