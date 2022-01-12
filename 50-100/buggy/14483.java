public static android.database.Cursor getCursorFromList(java.util.ArrayList<com.example.shalom.myapplication.model.entities.User> users) {
    android.database.MatrixCursor c = new android.database.MatrixCursor(com.example.shalom.myapplication.model.entities.Activity.COLUMNS());
    for (com.example.shalom.myapplication.model.entities.User user : users) {
        java.util.ArrayList<java.lang.String> temp = new java.util.ArrayList<>();
        try {
            temp.add(user.getUsername());
            temp.add(user.getPassword());
            c.addRow(temp);
            return c;
        } catch (java.lang.Exception e) {
            return null;
        }
    }
    return null;
}