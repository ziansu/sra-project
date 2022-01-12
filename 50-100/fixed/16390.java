@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.widget.Toast.makeText(this, "uploaded sucsessfully", Toast.LENGTH_SHORT).show();
    com.google.firebase.database.DatabaseReference imagevalue = com.google.firebase.database.FirebaseDatabase.getInstance().getReference().child("users").child(com.google.firebase.auth.FirebaseAuth.getInstance().getCurrentUser().getUid()).child("image");
    imagevalue.setValue("nodefault");
    notificationmanager.cancel(1);
}