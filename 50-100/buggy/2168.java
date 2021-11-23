@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample_java);
    mToolbar = ((android.support.v7.widget.Toolbar) (findViewById(com.joaquimley.faboptions.sample.R.id.toolbar)));
    mToolbar.setTitle(getString(R.string.title_activity_java));
    setSupportActionBar(mToolbar);
    com.joaquimley.faboptions.FabOptions fabOptions = ((com.joaquimley.faboptions.FabOptions) (findViewById(R.id.fab_options)));
    fabOptions.setButtonsMenu(this, R.menu.menu_faboptions);
    fabOptions.setOnClickListener(this);
}