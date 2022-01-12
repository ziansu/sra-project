public void galleryAddPic(android.content.Context context) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    if (android.text.TextUtils.isEmpty(mCurrentPhotoPath)) {
        return ;
    }
    java.io.File f = new java.io.File(mCurrentPhotoPath);
    android.net.Uri contentUri = android.net.Uri.fromFile(f);
    mediaScanIntent.setData(contentUri);
    mContext.sendBroadcast(mediaScanIntent);
    notifyMediaStoreScanner(context, f);
}