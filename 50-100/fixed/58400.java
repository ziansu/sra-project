@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_group_selector);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    mRealm = io.realm.Realm.getDefaultInstance();
    assert (getSupportActionBar()) != null;
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}