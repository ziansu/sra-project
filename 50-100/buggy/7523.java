public void unlockScreen() {
    android.util.Log.v("LOCK_TEST", "unlockScreen()");
    android.util.Log.v("LOCK_TEST", ("unlockScreen() " + (this.masterActivity.getLocalClassName())));
    this.pinView.setVisibility(8);
    this.mZipperLock.DestroyBitmaps();
    this.masterActivity.finish();
}