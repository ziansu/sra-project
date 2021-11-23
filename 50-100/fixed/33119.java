private void openCamera() {
    java.io.File image = null;
    java.lang.String filename;
    java.io.File imageFolder = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    filename = "home_image001.jpg";
    imageFolder.mkdirs();
    try {
        image = new java.io.File(imageFolder, filename);
        image.createNewFile();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    android.content.Intent cameraIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(cameraIntent, edu.ucsb.cs.cs185.contenant.contenant.AddHomeActivity.IMAGE_CAPTURE_REQUEST_CODE);
}