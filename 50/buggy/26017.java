@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    com.bionic.kvt.serviceapp.db.DbUtils.createUserTableIfNotExist();
    com.bionic.kvt.serviceapp.helpers.HeaderHelper headerHelper = new com.bionic.kvt.serviceapp.helpers.HeaderHelper(this);
    headerHelper.setHeader();
}