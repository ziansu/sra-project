@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    getWindow().setBackgroundDrawableResource(R.color.bg);
    super.onCreate(savedInstanceState, R.layout.activity_streamloading);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    if (!(getIntent().hasExtra(pct.droid.activities.StreamLoadingActivity.EXTRA_INFO)))
        finish();
    
    mInfo = getIntent().getParcelableExtra(pct.droid.activities.StreamLoadingActivity.EXTRA_INFO);
    mFragment = ((pct.droid.fragments.StreamLoadingFragment) (getSupportFragmentManager().findFragmentById(R.id.fragment)));
    pct.droid.activities.StreamLoadingActivity.sPlayerStarted = false;
}