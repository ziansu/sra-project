@java.lang.Override
public void showImage(android.net.Uri uri) {
    mEditImageView.setVisibility(View.VISIBLE);
    mEditImageView.setImageURI(uri);
    java.lang.String path = com.test.onepluswatermark.utils.FileUtils.getRealFilePath(getContext(), uri);
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inMutable = true;
    options.inSampleSize = 1;
    mEditBitmap = android.graphics.BitmapFactory.decodeFile(path, options);
    addWatermark();
}