@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    int stat = ((int) (dataSnapshot.getValue()));
    stat++;
    database.child("Users").child(user.getUid()).child(stats).setValue(stat);
}