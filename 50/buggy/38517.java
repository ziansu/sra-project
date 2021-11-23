@java.lang.Override
public void onDestroy() {
    android.util.Log.e("Destroy", "Changes");
    super.onDestroy();
    displayImage = null;
    myGallery.removeAllViews();
    myGallery = null;
    java.lang.System.gc();
}