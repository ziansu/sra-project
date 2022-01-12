@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.twitter.sdk.android.core.Twitter.initialize(this);
    setContentView(R.layout.activity_main);
    mTextMessage = findViewById(R.id.message);
    android.support.design.widget.BottomNavigationView navigation = findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    navigation.setSelectedItemId(R.id.navigation_friends);
}