public void takePicture() {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    java.io.File dir = android.os.Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
    java.lang.String picName = ("APPDOCK_" + timeStamp) + ".jpg";
    java.io.File output = new java.io.File(dir, picName);
    mCurrentPhotoPath = output.getAbsolutePath();
    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, android.net.Uri.fromFile(output));
    startActivityForResult(takePictureIntent, com.appdockproject.appdock.facebookActivity.CONTENT_REQUEST);
}