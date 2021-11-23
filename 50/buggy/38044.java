private void scanPhoto(java.io.File imageFile) {
    android.content.Intent mediaScanIntent = new android.content.Intent(android.content.Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
    android.net.Uri contentUri = android.net.Uri.fromFile(imageFile);
    mediaScanIntent.setData(contentUri);
    cordova.getActivity().sendBroadcast(mediaScanIntent);
}