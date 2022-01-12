@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    com.google.firebase.database.FirebaseDatabase database = com.google.firebase.database.FirebaseDatabase.getInstance();
    final com.google.firebase.database.DatabaseReference myRef = database.getReference("gallery");
    final java.lang.String reviewName = ((pizzeria) + "_") + timeStamp;
    myRef.child(pizzeria).child(reviewName).setValue(downloadUrl.toString());
    android.widget.Toast.makeText(getActivity(), "Thank you, your photo is uploaded", Toast.LENGTH_SHORT).show();
    returnBack();
}