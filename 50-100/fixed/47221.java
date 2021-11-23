@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    java.lang.String statusText = ("Successfully retrieved " + (dataSnapshot.getChildrenCount())) + " references to my lists.";
    statusTextView.setText(statusText);
    android.util.Log.d(getClass().getName(), statusText);
    findViewById(R.id.loading_layout).setVisibility(View.GONE);
}