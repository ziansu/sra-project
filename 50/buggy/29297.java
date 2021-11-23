@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    java.lang.System.out.println("GGGGGG");
    java.lang.System.out.println(dataSnapshot.getValue(com.example.erikkjernlie.tdt4140project.UserInfo.class));
    setUser(dataSnapshot.getValue(com.example.erikkjernlie.tdt4140project.UserInfo.class));
}