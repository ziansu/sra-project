@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_camera :
            android.util.Log.i(LOG_TAG, "Accessing Camera Activity...");
            android.content.Intent cameraIntent = new android.content.Intent(this, com.minerva.CameraActivity.class);
            startActivity(cameraIntent);
            break;
        case R.id.action_gallery :
            android.util.Log.i(LOG_TAG, "Accessing Gallery Activity...");
            android.content.Intent galleryIntent = new android.content.Intent(this, com.minerva.GalleryActivity.class);
            startActivity(galleryIntent);
            break;
        case R.id.action_home :
            break;
    }
    return false;
}