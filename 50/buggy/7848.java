@java.lang.Override
public void onSuccess(android.net.Uri uri) {
    com.squareup.picasso.Picasso.with(this).load(firebaseAuth.getCurrentUser().getPhotoUrl()).fit().centerCrop().into(profileIcon);
}