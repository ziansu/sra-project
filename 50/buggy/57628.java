@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    com.project.nghicv.readingbook.data.local.DatabaseSource.loadDataAtFirstTime();
    super.onCreate(savedInstanceState);
    setSupportActionBar(mToolbar);
    getSupportActionBar().setHomeButtonEnabled(true);
    setupDrawableMenu();
    initContent();
    setupAds();
}