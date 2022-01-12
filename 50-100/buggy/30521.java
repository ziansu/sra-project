@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "eiVK4YPZpFbKBxwKD3PlUpSdDflusDQEZhhlPaWd", "hRw4QGOAYJKnWGS0BJuhRH6xUtRVpLrvGHz393PL");
    com.parse.ParseInstallation.getCurrentInstallation().saveInBackground();
    btn_login = ((android.widget.Button) (findViewById(R.id.id_btn_login)));
    btn_sign_up = ((android.widget.Button) (findViewById(R.id.id_btn_sign_up)));
    btn_login.setOnClickListener(this);
    btn_sign_up.setOnClickListener(this);
}