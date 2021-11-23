@java.lang.Override
public byte[] call() throws java.lang.Exception {
    mPixelBuffer.render();
    android.graphics.Bitmap result = mPixelBuffer.convertToBitmap();
    if (result == null) {
        return null;
    }
    mBaos.reset();
    result.compress(Bitmap.CompressFormat.JPEG, 100, mBaos);
    byte[] roi = mBaos.toByteArray();
    mRoi = roi;
    if ((mListener) != null) {
        mListener.onUpdate(this, roi);
    }
    return roi;
}