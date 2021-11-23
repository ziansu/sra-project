private void cropAndSetMethod(int position) {
    cropImageAndSetWallpaper(position);
    done();
    com.crashlytics.android.Crashlytics.log("crop true");
}