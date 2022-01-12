@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_add_friend, menu);
    friendEmailView = ((android.widget.EditText) (findViewById(R.id.add_friend_email)));
    friendUsernameView = ((android.widget.EditText) (findViewById(R.id.add_friend_username)));
    return true;
}