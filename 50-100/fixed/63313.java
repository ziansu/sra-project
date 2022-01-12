public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    ((android.widget.TextView) (findViewById(R.id.votecounter))).setText(snapshot.child("sabotage_counter").getValue().toString());
    if ((((java.lang.Long) (snapshot.child("sabotage_counter").getValue())).longValue()) == (((java.lang.Long) (snapshot.child("num_players").getValue())).longValue())) {
        allVotesCounted();
    }
}