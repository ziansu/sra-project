@java.lang.Override
protected void onPostExecute(android.database.Cursor cursor) {
    java.util.ArrayList<com.example.shalom.myapplication.model.entities.User> users = com.example.shalom.myapplication.model.entities.User.getListFromCursor(cursor);
    for (com.example.shalom.myapplication.model.entities.User user : users) {
        if (((user.getUsername()) == (u.getUsername())) && ((user.getPassword()) == (u.getPassword()))) {
            startActivity(new android.content.Intent(this, com.example.shalom.myapplication.Controller.MainOptions.class));
        }
    }
}