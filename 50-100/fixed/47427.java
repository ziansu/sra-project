private void handleImageOrGif(android.net.Uri uri) {
    getContentResolver().getType(uri);
    java.lang.String extension = getContentResolver().getType(uri).substring(((getContentResolver().getType(uri).lastIndexOf("/")) + 1));
    android.util.Log.d("extension", extension);
    if (extension.equals("gif")) {
        handleGif(uri);
    }else {
        startImageCropActivity(uri);
    }
}