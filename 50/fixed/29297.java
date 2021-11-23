@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    setUser(dataSnapshot.getValue(com.example.erikkjernlie.tdt4140project.UserInfo.class));
}