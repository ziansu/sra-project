@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_description);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    setView();
    helper = com.example.billy.lakemerrittguide.LakeMerrittSQLiteOpenHelper.getInstance(this);
    getAndSetIntentToView();
    setFavoriteButtonImage();
    setFavoriteButton();
    setImageClickToReturnHome();
}