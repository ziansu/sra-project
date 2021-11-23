@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    checkForPermissions();
    sharedPreferences = getSharedPreferences("squirrel", info.philboyd.secretsquirrelsociety.activities.MODE_PRIVATE);
    isMember = sharedPreferences.getBoolean("isMember", false);
    isBanned = sharedPreferences.getBoolean("isBanned", false);
    if (isBanned) {
        prepareBanned();
    }else
        if (isMember) {
            prepareMember();
        }else {
            prepareNonMember();
        }
    
}