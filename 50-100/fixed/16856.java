private void setAdapter() {
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.listview)));
    adapter = new uk.ac.gla.dcs.friendfinder.FriendListAdapter(this.getBaseContext(), uk.ac.gla.dcs.friendfinder.DatabaseHelper.getInstance(getBaseContext()).getAllFriends(), this);
    listView.setAdapter(adapter);
}