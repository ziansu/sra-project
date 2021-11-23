@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mThumbnailThread.quit();
    android.util.Log.i(com.example.photogallery.PhotoGalleryFragment.TAG, "Background thread destroyed!");
}