@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    be.kandoe_groepj.kandoeproject.kandoeproject.helper.TokenIO.initSharedPreferences(getPreferences(Context.MODE_PRIVATE));
    java.lang.String token = be.kandoe_groepj.kandoeproject.kandoeproject.helper.TokenIO.loadToken();
    if (token.equals("")) {
    }else {
        be.kandoe_groepj.kandoeproject.kandoeproject.helper.TokenIO.removeToken();
    }
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    setContentView(R.layout.activity_login);
    bindComponents();
    addEventsToComponents();
    presenter = new be.kandoe_groepj.kandoeproject.kandoeproject.login.LoginPresenterImpl(this);
}