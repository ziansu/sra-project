public static void uploadImage(final com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.MediaSaverListener listener, android.graphics.Bitmap image, android.graphics.Bitmap overlay) {
    java.io.File file = null;
    try {
        file = new java.io.File(com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.saveImagetoFile(image, overlay));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.generateUploadParams(listener, file, true);
}