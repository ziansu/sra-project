@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.firebase.client.Firebase.setAndroidContext(this);
    setContentView(R.layout.activity_friend_list);
    super.onCreateDrawer();
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new com.gatech.objectsanddesign.shoppingwithfriends.FriendList.PlaceholderFragment()).commit();
    }
}