private android.content.Intent createIntent(@android.support.annotation.NonNull
android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    intent.addFlags(((android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION) | (android.content.Intent.FLAG_GRANT_WRITE_URI_PERMISSION)));
    if ((mOutputFile) != null) {
        android.net.Uri cameraTempUri = android.support.v4.content.FileProvider.getUriForFile(context, ((context.getPackageName()) + ".com.sw926.imagefileselector.provider"), mOutputFile);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, cameraTempUri);
        intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
    }
    return intent;
}