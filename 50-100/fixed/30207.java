private void galleryIntent() {
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
    startActivityForResult(android.content.Intent.createChooser(intent, "Select File"), SELECT_FILE);
}