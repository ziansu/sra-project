@java.lang.Override
public void addPictureToGallery(java.io.File imageUri) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    android.net.Uri contentUri = android.net.Uri.fromFile(imageUri);
    mediaScanIntent.setData(contentUri);
    getActivity().sendBroadcast(mediaScanIntent);
}