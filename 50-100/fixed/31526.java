@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.shalom.myapplication.model.entities.User> users) {
    android.widget.EditText username = ((android.widget.EditText) (findViewById(R.id.username)));
    for (com.example.shalom.myapplication.model.entities.User user : users) {
        if (user.getUsername().equals(username.getText().toString())) {
            username.setText("That username is already used...");
            return ;
        }
    }
}