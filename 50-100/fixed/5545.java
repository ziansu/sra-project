@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_join_game);
    welcome = ((android.widget.TextView) (findViewById(R.id.welcomeTxt)));
    android.content.Intent intent = getIntent();
    username = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE_USERNAME);
    mController = new museum.findit.com.myapplication.controller.Controller(this);
}