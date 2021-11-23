@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    android.widget.ListView list = ((android.widget.ListView) (findViewById(R.id.friendListView)));
    android.widget.ListAdapter adapter = new android.widget.SimpleAdapter(this, FriendsList, R.layout.friends_list_items, new java.lang.String[]{ com.skyrealm.brockyy.findmypeepsapp.FriendsListActivity.TAG_FRIEND }, new int[]{ R.id.username });
    list.setAdapter(adapter);
    pDialog.dismiss();
}