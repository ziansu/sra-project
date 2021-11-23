@java.lang.Override
public void done(byte[] data, com.parse.ParseException e) {
    if (e == null) {
        android.graphics.Bitmap profilePicBmp = android.graphics.BitmapFactory.decodeByteArray(data, 0, data.length);
        userProfilePic.setImageBitmap(profilePicBmp);
        android.widget.ImageView navProfilePic = ((android.widget.ImageView) (findViewById(R.id.navImage)));
        navProfilePic.setImageBitmap(profilePicBmp);
        pictureUploadProgress.dismiss();
    }else {
    }
}