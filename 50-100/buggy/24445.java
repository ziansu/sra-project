@java.lang.Override
protected java.util.ArrayList<com.androidd.mehrdad.europeanleague.API.FixturesHolder> doInBackground(java.lang.Void... params) {
    com.androidd.mehrdad.europeanleague.API.FixturesLeague fixturesLeague = new com.androidd.mehrdad.europeanleague.API.FixturesLeague();
    java.util.ArrayList<com.androidd.mehrdad.europeanleague.API.FixturesHolder> newHolders = null;
    try {
        newHolders = fixturesLeague.fixtureInfo(linkLeague);
        today(newHolders, ((currentMatch) + ""));
    } catch (org.json.JSONException e) {
        android.widget.Toast.makeText(this, "cannot connect to server...", Toast.LENGTH_LONG).show();
        finish();
    }
    return newHolders;
}