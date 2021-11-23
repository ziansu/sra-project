@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (dataSnapshot.exists()) {
    }else {
        java.lang.String token = com.google.firebase.iid.FirebaseInstanceId.getInstance().getToken();
        devicesRef.child(token).child("font_size").setValue("Small");
        devicesRef.child(token).child("notification_enable").setValue(true);
        devicesRef.child(token).child("notification_time").setValue("06:00");
    }
}