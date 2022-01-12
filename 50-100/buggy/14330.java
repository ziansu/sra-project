@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    @java.lang.SuppressWarnings(value = "VisibleForTests")
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    tvPath.setText(downloadUrl.toString());
    dao.setImagePath(downloadUrl.toString());
    firebase.getDatabase("news").child(id).setValue(dao);
    android.widget.Toast.makeText(getActivity(), "Upload Complete", Toast.LENGTH_LONG).show();
    getActivity().finish();
}