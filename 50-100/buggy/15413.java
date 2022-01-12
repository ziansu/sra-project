public static void uploadVideo(final com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.MediaSaverListener listener, java.lang.String videoPath, android.graphics.Bitmap overlay) {
    com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.generateUploadParams(listener, null);
    try {
        com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.saveVideotoFile(videoPath, overlay, true);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}