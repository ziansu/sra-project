@java.lang.Override
protected void onStart() {
    super.onStart();
    loadFromFile();
    adapter = new android.widget.ArrayAdapter<ca.ualberta.cs.lonelytwitter.Tweet>(this, R.layout.list_item, tweets);
    oldTweetsList.setAdapter(adapter);
    adapter.notifyDataSetChanged();
}