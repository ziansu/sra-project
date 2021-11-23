@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    realm = io.realm.Realm.getDefaultInstance();
    loadVersionCode();
    checkIfUserIsLoggedIn();
}