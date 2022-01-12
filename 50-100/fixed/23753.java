@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot data : dataSnapshot.getChildren()) {
        friends.add(friendsIndex, new it.polito.mad14.myDataStructures.Contact(data.child("Name").getValue().toString(), data.child("Surname").getValue().toString(), data.child("Username").getValue().toString(), data.child("Email").getValue().toString()));
        (friendsIndex)++;
    }
}