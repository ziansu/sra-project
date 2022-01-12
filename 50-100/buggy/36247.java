public android.net.Uri getImageUri(android.content.Context inContext, android.graphics.Bitmap inImage) {
    android.widget.Toast.makeText(getApplicationContext(), "Image is saved", Toast.LENGTH_SHORT).show();
    java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
    java.lang.String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, "Title", null);
    return android.net.Uri.parse(path);
}