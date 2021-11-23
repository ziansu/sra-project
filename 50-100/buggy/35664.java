@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if (dataSnapshot.hasChildren()) {
        for (int i = 0; i < (dataSnapshot.getChildrenCount()); i++) {
            java.lang.String name = dataSnapshot.child((i + "")).getValue(java.lang.String.class);
            com.firebase.client.Firebase inviteRef = getUserInvitationPath(name);
            inviteRef.child(googleID).removeValue();
        }
    }
}