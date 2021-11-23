@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot d : dataSnapshot.child("Private User Data").child(mUserId).getChildren()) {
        userName.setText("aa");
        userEmail.setText("bb");
        com.example.saathi.Student c = d.getValue(com.example.saathi.Student.class);
        java.lang.String nameVal = c.getName();
        java.lang.String emailVal = mFirebaseAuth.getCurrentUser().getEmail();
        userName.setText(nameVal);
        userEmail.setText(emailVal);
    }
}