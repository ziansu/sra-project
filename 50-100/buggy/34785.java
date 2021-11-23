protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (resultCode) {
        case 0 :
            if (resultCode == (RESULT_OK)) {
                android.net.Uri selectedImage = data.getData();
                imageView.setImageURI(selectedImage);
            }
            break;
        case 1 :
            if (resultCode == (RESULT_OK)) {
                android.net.Uri selectedImage = data.getData();
                imageView.setImageURI(selectedImage);
            }
            break;
    }
}