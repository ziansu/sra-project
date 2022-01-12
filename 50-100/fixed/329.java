@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    updateImageInDatabase(downloadUrl.toString());
    com.bumptech.glide.Glide.with(getApplicationContext()).load(data).bitmapTransform(new com.example.mjokic.quizapp.utils.GlideCircleTransformation(this)).into(((android.widget.ImageView) (findViewById(R.id.navDrawerAvatar))));
    progressDialog.hide();
}