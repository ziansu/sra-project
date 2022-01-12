@java.lang.Override
public void oneclick() {
    android.content.Intent camera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(camera, 0);
}