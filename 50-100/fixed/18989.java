@java.lang.Override
public cn.trinea.android.common.entity.CacheObject<android.graphics.Bitmap> onGetData(java.lang.String key) {
    android.graphics.Bitmap d = null;
    try {
        d = cn.trinea.android.common.util.ImageUtils.getBitmapFromUrl(getContext(), key, httpReadTimeOut, requestProperties);
    } catch (java.lang.Exception e) {
        android.util.Log.e(cn.trinea.android.common.service.impl.ImageMemoryCache.TAG, ("get image exception, imageUrl is:" + key), e);
    }
    return d == null ? null : new cn.trinea.android.common.entity.CacheObject<android.graphics.Bitmap>(d);
}