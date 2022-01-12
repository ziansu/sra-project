@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    mGenreSelectSpinner.setSelection(PopulateUserGenreData(dataSnapshot));
    GetUserHomeLocation(dataSnapshot);
}