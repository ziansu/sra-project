@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.google.firebase.database.DatabaseReference mJoin = mDatabaseRefEventP.push();
    mJoin.child("participants").setValue(user_id).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.Void>() {
        @java.lang.Override
        public void onComplete(@android.support.annotation.NonNull
        com.google.android.gms.tasks.Task<java.lang.Void> task) {
            android.widget.Toast.makeText(com.example.a15017523.eventful.ViewEventDetails.this, "Registration success", Toast.LENGTH_SHORT).show();
        }
    });
}