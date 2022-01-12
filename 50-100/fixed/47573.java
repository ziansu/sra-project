@java.lang.Override
public boolean onNavigationItemSelected(@android.support.annotation.NonNull
android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_camera :
            break;
        case R.id.action_gallery :
            mCamera.release();
            finish();
            android.content.Intent galleryIntent = new android.content.Intent(this, com.minerva.GalleryActivity.class);
            this.startActivity(galleryIntent);
            break;
        case R.id.action_home :
            mCamera.release();
            finish();
            android.content.Intent intent = new android.content.Intent(this, com.minerva.MainActivity.class);
            this.startActivity(intent);
            finish();
            break;
    }
    return false;
}