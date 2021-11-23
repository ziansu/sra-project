@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_profile);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    client = com.codepath.apps.finch.TwitterApplication.getRestClient();
    butterknife.ButterKnife.bind(this);
    context = this;
    if (savedInstanceState == null) {
    }
    getUserInfo();
}