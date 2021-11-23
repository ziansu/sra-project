@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login);
    initUI();
    com.backendless.Backendless.setUrl(Defaults.SERVER_URL);
    com.backendless.Backendless.initApp(this, Defaults.APPLICATION_ID, Defaults.SECRET_KEY, Defaults.VERSION);
    if (isOnline()) {
        new com.example.justicecamera.LoginActivity.VersionCheckTask().execute();
    }else {
        android.widget.Toast.makeText(this, getString(R.string.check_internet_connection), Toast.LENGTH_SHORT).show();
    }
}