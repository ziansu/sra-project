@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    for (com.firebase.client.DataSnapshot snapshot : dataSnapshot.getChildren()) {
        com.example.guest.chattinu.models.User user = snapshot.getValue(com.example.guest.chattinu.models.User.class);
        users.add(user);
    }
    setUserNames(users);
}