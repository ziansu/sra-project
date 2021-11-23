@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.d("fuck android", java.lang.String.valueOf(dataSnapshot.getValue()));
    if ((dataSnapshot.getValue()) != null) {
        if (java.util.Objects.equals(dataSnapshot.getValue().toString(), "true")) {
            trackifySwitch.setChecked(true);
        }else
            trackifySwitch.setChecked(false);
        
    }
}