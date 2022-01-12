@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.userhome);
    android.widget.TextView username = ((android.widget.TextView) (findViewById(R.id.username)));
    int userid = 0;
    userid = getIntent().getIntExtra("User_id", userid);
    user = dbHandler.GetsUserByID(userid);
    username.append(("" + (user.getUsername())));
}