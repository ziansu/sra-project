private void takePhoto() throws java.io.IOException {
    android.content.Intent takePictureIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    java.io.File photoFile = null;
    try {
        photoFile = getFile();
    } catch (java.io.IOException ex) {
    }
    if (photoFile != null) {
        photoURI = android.support.v4.content.FileProvider.getUriForFile(getContext(), "com.example.android.fileprovider", photoFile);
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
        startActivityForResult(takePictureIntent, tk.talcharnes.unborify.MainActivityFragment.REQUEST_IMAGE_CAPTURE);
    }
}