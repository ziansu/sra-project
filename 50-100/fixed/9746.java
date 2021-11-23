public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == (com.example.deepak.socialnetworkingapp.upload.SELECT_PICTURE)) {
            android.net.Uri selectedImageUri = data.getData();
            if (null != selectedImageUri) {
                imgView.setImageURI(selectedImageUri);
            }
        }
    }
}