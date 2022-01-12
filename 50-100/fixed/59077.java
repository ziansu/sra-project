public void setUpView() {
    android.content.Intent intent = getIntent();
    username = intent.getStringExtra(Launch.EXTRA_USERNAME);
    java.util.ArrayList<java.lang.String> players = intent.getStringArrayListExtra(Launch.EXTRA_LOBBY_USERS);
    android.widget.TextView textView = ((android.widget.TextView) (findViewById(R.id.usernameDisplay)));
    textView.setText(username);
    final android.widget.ListView playersListView = ((android.widget.ListView) (findViewById(R.id.playerList)));
    android.widget.ArrayAdapter<java.lang.String> playersAdapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, players);
    playersListView.setAdapter(playersAdapter);
}