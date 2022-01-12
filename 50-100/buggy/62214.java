@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot != null) {
        jstam.programmeerproject_scubascan.Items.LastDive last_dive = dataSnapshot.getValue(jstam.programmeerproject_scubascan.Items.LastDive.class);
        if (last_dive != null) {
            last_date = last_dive.getDate();
            last_time_out = last_dive.getTimeOut();
            last_letter = last_dive.getLetter();
            last_totaltime = last_dive.getTotaltime();
            android.util.Log.d("test8", ("last total time is: " + (last_totaltime)));
        }
    }
    calculateValues();
}