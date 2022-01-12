private void writeImageFile(java.lang.String path, org.opencv.core.Mat image) {
    byte[] imageBytes = new byte[((int) ((image.total()) * (image.channels())))];
    image.get(0, 0, imageBytes);
    try {
        java.io.FileOutputStream imageFos = context.openFileOutput(path, Context.MODE_PRIVATE);
        imageFos.write(imageBytes);
        imageFos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}