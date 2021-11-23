public void choosePhoto(android.view.View view) {
    choise = 2;
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(android.content.Intent.createChooser(intent, "Select File"), SELECT_FILE);
}