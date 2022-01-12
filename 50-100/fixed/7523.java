public void unlockScreen() {
    android.util.Log.v("LOCK_TEST", "unlockScreen()");
    android.util.Log.v("LOCK_TEST", ("unlockScreen() " + (this.masterActivity.getLocalClassName())));
    this.mZipperLock.DestroyBitmaps();
    this.masterActivity.finish();
}