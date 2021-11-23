@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    progressDialog.show();
    java.lang.String imageUrl = fbUser.getPhotoUrl().toString();
    updateImageInDatabase(imageUrl);
    com.bumptech.glide.Glide.with(this).load(imageUrl).bitmapTransform(new com.example.mjokic.quizapp.utils.GlideCircleTransformation(this)).diskCacheStrategy(DiskCacheStrategy.ALL).into(((android.widget.ImageView) (findViewById(R.id.navDrawerAvatar))));
    progressDialog.hide();
}