@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_diary);
    butterknife.ButterKnife.bind(this);
    setSupportActionBar(mToolbar);
    setupNavigationView(mToolbar);
    android.support.v7.app.ActionBar supportActionBar = getSupportActionBar();
    if (supportActionBar != null) {
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setTitle("Diary title");
    }
    getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new com.travelersdiary.fragments.DiaryFragment()).commit();
}