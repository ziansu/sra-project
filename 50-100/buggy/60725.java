@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);
    if (!(metropolia.fi.suondbubbles.activities.SoundBubbles.userIsLogged()))
        metropolia.fi.suondbubbles.activities.SoundBubbles.openLoginActivity(this);
    
    initViews();
    initMediaPlayer();
    showCategoriesList();
}