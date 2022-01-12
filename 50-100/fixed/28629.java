@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    int stat = java.lang.Integer.parseInt(dataSnapshot.getValue().toString());
    stat++;
    database.child("Users").child(user.getUid()).child(stats).setValue(stat);
}