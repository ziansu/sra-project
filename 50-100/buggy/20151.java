@java.lang.Override
public void call(java.lang.Object... args) {
    if ((args[0]) != null) {
        android.util.Log.e(TAG, args[0].toString());
    }else {
        mImage.setImageBitmap(((android.graphics.Bitmap) (args[1])));
    }
    mActivity.hideLoadingIndicator();
}