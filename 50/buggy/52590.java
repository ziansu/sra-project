@java.lang.Override
public void attach(android.hardware.Camera camera) throws java.io.IOException {
    android.util.Log.w(org.thoughtcrime.securesms.components.camera.TexturePreviewStrategy.TAG, "attach(Camera)");
    camera.setPreviewTexture(surface);
}