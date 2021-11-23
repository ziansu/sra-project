@permissions.dispatcher.NeedsPermission(value = { Manifest.permission.READ_EXTERNAL_STORAGE })
void chooseImage() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
        i.setType("image/*");
        startActivityForResult(android.content.Intent.createChooser(i, "File Chooser"), SELECT_PICTURE);
    }
}