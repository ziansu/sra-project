@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    for (com.firebase.client.DataSnapshot child : dataSnapshot.getChildren()) {
        email = ((java.lang.String) (child.child("email").getValue()));
        java.lang.System.out.println(("email:" + (email)));
        if (userId.equals(myRef.getAuth().getUid())) {
            inGroup = true;
        }
        members.add(email);
        groupid.add(email);
    }
}