@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if (process) {
        mDatabase.child("approved").setValue("false");
        mDatabase.child("removed").setValue(1);
        process = false;
        android.support.v7.app.AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}