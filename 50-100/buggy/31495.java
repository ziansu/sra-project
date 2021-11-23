@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    friendsList = intent.getStringExtra(Constants.FRIENDS);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    final com.neustart.wayf.FriendsListModel[] wrapper = gson.fromJson(friendsList, com.neustart.wayf.FriendsListModel[].class);
    com.neustart.wayf.Requests.GetFriendsLocationTask gfl = new com.neustart.wayf.Requests.GetFriendsLocationTask(getApplicationContext());
    gfl.execute(friendsList);
    for (com.neustart.wayf.FriendsListModel flm : wrapper) {
    }
}