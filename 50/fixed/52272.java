@java.lang.Override
public void addPictureToGallery(android.net.Uri imageUri) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    mediaScanIntent.setData(imageUri);
    getActivity().sendBroadcast(mediaScanIntent);
}