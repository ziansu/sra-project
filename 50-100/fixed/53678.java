@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    if (savedInstanceState == null) {
        app.com.example.android.bulletpoints.ui.DetailActivityFragment fragment = new app.com.example.android.bulletpoints.ui.DetailActivityFragment();
        fragment.setArguments(getIntent().getExtras());
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
            postponeEnterTransition();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_detail, fragment).commit();
    }
}