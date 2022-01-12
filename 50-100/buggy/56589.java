@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent imageReturnedIntent) {
    super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
    switch (requestCode) {
        case ca.ualberta.andromeda.AddMoodActivity.IMAGE_PICK :
            if (resultCode == (RESULT_OK)) {
                android.net.Uri selectedImage = imageReturnedIntent.getData();
                PictureHolder.setImageURI(selectedImage);
            }
    }
}