@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    eventExists.findViewById(R.id.event_exists);
    eventExists.setVisibility(View.GONE);
}