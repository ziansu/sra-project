@java.lang.Override
public void attach(android.hardware.Camera camera) throws java.io.IOException {
    camera.setPreviewTexture(surface);
}