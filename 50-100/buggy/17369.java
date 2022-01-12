private void dispatchGetPictureIntent() {
    android.content.Intent getPictureIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    if ((mCurrentPhotoPath) != null) {
        android.util.Log.d("Main Activity", mCurrentPhotoPath);
    }else {
        android.util.Log.d("Main Activity", "mCurrentPhotoPath is null");
    }
    if ((getPictureIntent.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(getPictureIntent, com.test.cad.breadcrumbs.activities.MainActivity.REQUEST_GET_PHOTO_ID);
    }else
        android.widget.Toast.makeText(this, "Could not get gallery intent", Toast.LENGTH_SHORT).show();
    
}