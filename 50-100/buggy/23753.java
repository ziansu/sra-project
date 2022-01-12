@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot data : dataSnapshot.getChildren()) {
        friends.add(friendsIndex, new it.polito.mad14.myDataStructures.Contact(data.child("Name").toString(), data.child("Surname").toString(), data.child("Username").toString(), data.child("Email").toString()));
        (friendsIndex)++;
    }
}