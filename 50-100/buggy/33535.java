@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    boolean isTwoPane = getResources().getBoolean(R.bool.large_layout);
    if (isTwoPane) {
        setSupportActionBar(mToolbar);
        if ((getSupportActionBar()) != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(R.string.now_playing);
        }
    }
    setupIntent(savedInstanceState);
}