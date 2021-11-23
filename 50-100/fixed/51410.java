@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_chat);
    initFields(getIntent());
    if ((mIsAlive) && (savedInstanceState == null)) {
        cancelNotifications();
        resetNumNewMessages();
        if (!(mIsArchived)) {
            updatePartnerIfNeeded();
        }
    }else
        if (!(mIsAlive)) {
            disableBottomBar();
        }
    
    initActionBar();
    initMessages();
}