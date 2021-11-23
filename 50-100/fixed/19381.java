private void getNewPhotoFromActivity(android.content.Intent data) throws java.io.IOException {
    final boolean isCamera;
    if ((data == null) || (data.toString().equals("Intent {  }"))) {
        isCamera = true;
    }else {
        final java.lang.String action = data.getAction();
        isCamera = (action != null) && (action.equals(MediaStore.ACTION_IMAGE_CAPTURE));
    }
    if (isCamera) {
        editedPhotoUri = outputFileUri;
    }else {
        editedPhotoUri = data.getData();
    }
    convertImage(editedPhotoUri);
}