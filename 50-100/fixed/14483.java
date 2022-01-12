public static android.database.Cursor getCursorFromList(java.util.ArrayList<com.example.shalom.myapplication.model.entities.User> users) {
    android.database.MatrixCursor c = new android.database.MatrixCursor(com.example.shalom.myapplication.model.entities.User.COLUMNS());
    for (com.example.shalom.myapplication.model.entities.User user : users) {
        c.addRow(new java.lang.Object[]{ user.getUsername() , user.getPassword() });
        return c;
    }
    return c;
}