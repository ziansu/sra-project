private void writeImageFile(java.lang.String path, org.opencv.core.Mat image) {
    byte[] buffer = new byte[((int) ((image.total()) * (image.channels())))];
    image.get(0, 0, buffer);
    try {
        java.io.FileOutputStream imageFos = context.openFileOutput(path, Context.MODE_PRIVATE);
        imageFos.write(buffer);
        imageFos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}