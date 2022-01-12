@java.lang.Override
public boolean onException(java.lang.Exception e, java.lang.String model, com.bumptech.glide.request.target.Target<android.graphics.Bitmap> target, boolean isFirstResource) {
    android.util.Log.e(br.com.catbag.gifreduxsample.ui.wrappers.GlideWrapper.TAG, "", e);
    if ((mExceptionListener) != null) {
        if (e == null)
            mExceptionListener.onException(new java.lang.Exception("glide load error"));
        else
            mExceptionListener.onException(e);
        
    }
    return false;
}