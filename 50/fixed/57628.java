@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.project.nghicv.readingbook.data.local.DatabaseSource.loadDataAtFirstTime();
    setSupportActionBar(mToolbar);
    getSupportActionBar().setHomeButtonEnabled(true);
    setupDrawableMenu();
    initContent();
    setupAds();
}