@java.lang.Override
protected void onPause() {
    super.onPause();
    gyroscopeObserver.unregister();
    contentImagePreviewImage.setImageBitmap(null);
}