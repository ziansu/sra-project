@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mFriendsList = new java.util.ArrayList<>();
    mFriendsList.add(new com.amgems.selfiechat.model.Friend("Zac", R.drawable.zac));
    mFriendsList.add(new com.amgems.selfiechat.model.Friend("Jeremy", R.drawable.jeremy));
    mFriendsList.add(new com.amgems.selfiechat.model.Friend("Omar", R.drawable.omar));
}