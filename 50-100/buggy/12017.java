public static com.orca.projectx.Account getAccount(com.firebase.client.Firebase ref) {
    com.firebase.client.Firebase mRef = ref.child("account");
    mRef.addValueEventListener(new com.firebase.client.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
            com.orca.projectx.Account account = dataSnapshot.getValue(com.orca.projectx.Account.class);
            com.orca.projectx.Data.setAccount(account);
        }

        @java.lang.Override
        public void onCancelled(com.firebase.client.FirebaseError firebaseError) {
        }
    });
    return com.orca.projectx.Data.mAccount;
}