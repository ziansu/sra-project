@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (((requestCode == (com.example.vincentzhu.testapplication.PersonalRecipe.RESULT_IMAGE)) && (resultCode == (RESULT_OK))) && (data != null)) {
        android.net.Uri selectedImage = data.getData();
        imageDisplay.setImageURI(selectedImage);
    }
}