@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);
    sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
    registerPresenter = new com.sportify.register.presenter.RegisterPresenterImpl(this, sharedPref);
    dialog = new android.app.ProgressDialog(this);
    password = ((android.widget.EditText) (findViewById(R.id.etRegisterPassword)));
    email = ((android.widget.EditText) (findViewById(R.id.etRegisterMail)));
}