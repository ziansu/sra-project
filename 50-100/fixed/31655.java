@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, requestCode, data);
    imageUri = data.getData();
    if ((resultCode == (RESULT_OK)) && (requestCode == (com.example.webbj.imageeditor.MainActivity.PICK_IMAGE))) {
        imageView.setImageURI(imageUri);
        try {
            imageView.setImageBitmap(com.example.webbj.imageeditor.MainActivity.handleSamplingAndRotationBitmap(this, imageUri));
        } catch (java.lang.Exception e) {
        }
    }
}