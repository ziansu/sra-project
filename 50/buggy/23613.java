private void beginCrop(android.net.Uri source) {
    android.net.Uri destination = android.net.Uri.fromFile(new java.io.File(getCacheDir(), "cropped"));
    com.soundcloud.android.crop.Crop.of(source, destination).asSquare().start(this);
}