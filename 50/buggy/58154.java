@java.lang.Override
public void navigateChangedImagesScreen() {
    android.content.Intent intent = com.invisibleteam.goinvisible.mvvm.images.ImagesActivity.buildIntent(this);
    startActivity(intent);
    finish();
}