@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    java.lang.String downloadUrl = taskSnapshot.getDownloadUrl().toString();
    databaseReference.child(uid).child(java.lang.String.valueOf(adId)).child("images").push().setValue(downloadUrl);
    progressDialog.dismiss();
}