@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_friends_list);
    friendsList = ((android.widget.ListView) (findViewById(R.id.friend_list)));
    goToUser = ((android.widget.TextView) (findViewById(R.id.username)));
    goToUser.setOnClickListener(this);
    friends = new java.util.ArrayList<>();
    getFriends();
}