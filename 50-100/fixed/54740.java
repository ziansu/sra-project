@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String email = ((android.widget.EditText) (findViewById(R.id.signinEmailInput))).getText().toString();
    java.lang.String password = ((android.widget.EditText) (findViewById(R.id.signinPasswordInput))).getText().toString();
    password = com.trade.barter.utils.Utils.md5(password);
    if (com.trade.barter.utils.Utils.checkConnectivity(getApplicationContext())) {
        new com.trade.barter.api.ApiManager(getApplicationContext()).loginTrader(this, email, password);
    }
}