@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setTheme(R.style.Theme_eXo);
    setContentView(R.layout.activity_display_view);
    org.exoplatform.ui.social.SocialDetailActivity.socialDetailActivity = this;
    currentPosition = getIntent().getIntExtra(ExoConstants.ACTIVITY_CURRENT_POSITION, currentPosition);
    changeLanguage();
    if (savedInstanceState != null)
        finish();
    else
        initComponent();
    
}