private void dispatchTakePictureFromGallery() {
    android.content.Intent getIntent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    getIntent.setType("image/*");
    android.content.Intent pickIntent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    pickIntent.setType("image/*");
    android.content.Intent chooserIntent = android.content.Intent.createChooser(getIntent, "Select Image");
    chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, new android.content.Intent[]{ pickIntent });
    startActivityForResult(chooserIntent, nl.hanze.myhealth.PhotoIntentActivity.PICK_IMAGE);
}