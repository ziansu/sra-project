@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    userFirstName = dataSnapshot.getValue().toString();
    userName.setText(userFirstName);
}