@java.lang.Override
public void onFinish() {
    new java.io.File(videoPath).delete();
    if (isUploading) {
        com.wolfpakapp.wolfpak2.camera.editor.MediaSaver.upload(new java.io.File(outputPath), false);
    }
    stopSelf(msg2.arg1);
}