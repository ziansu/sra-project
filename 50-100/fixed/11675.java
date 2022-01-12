@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (getSharedPreferences(CONST.PREFS, com.brainmurphy.roomhack.MODE_PRIVATE).getBoolean(CONST.IS_LOGGED_IN, false)) {
        startActivity(new android.content.Intent(this, com.brainmurphy.roomhack.Dashboard.class));
    }
    bLogin = ((android.widget.Button) (findViewById(R.id.bLogIn)));
    bLogin.setOnClickListener(this);
    bRegister = ((android.widget.Button) (findViewById(R.id.bRegister)));
    bRegister.setOnClickListener(this);
}