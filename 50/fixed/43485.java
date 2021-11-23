private void initRotationForDisplay(@android.support.annotation.Nullable
final net.gini.android.vision.internal.camera.photo.ExifReader exifReader) {
    if ((((mImageDocument) != null) && (mImageDocument.isImported())) && (exifReader != null)) {
        mRotationForDisplay = exifReader.getOrientationAsDegrees();
    }
}