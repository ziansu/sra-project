@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    boolean isTwoPane = getResources().getBoolean(R.bool.large_layout);
    if (isTwoPane) {
        if ((mToolbar) != null) {
            setSupportActionBar(mToolbar);
            if ((getSupportActionBar()) != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setTitle(R.string.now_playing);
            }
        }
    }
    setupIntent(savedInstanceState);
}