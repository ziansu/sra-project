@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot appSnapshot : dataSnapshot.getChildren()) {
        appSnapshot.getRef().removeValue();
    }
}