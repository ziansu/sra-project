@java.lang.Override
public void oneclick() {
    android.content.Intent camera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(camera, 0);
    android.content.Intent i = new android.content.Intent(this, com.example.bordia98.drawer.upload_activity.class);
    startActivity(i);
}