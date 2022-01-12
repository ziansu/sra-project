@java.lang.Override
public void onCompleted(java.lang.Exception e, final com.koushikdutta.ion.ImageViewBitmapInfo result) {
    loaded = true;
    progress.setVisibility(View.GONE);
    if (e != null) {
        return ;
    }
    initImageCallback(position, post, imageCallback);
    if ((result.getBitmapInfo()) != null) {
        bitmapCacheKeys.add(result.getBitmapInfo().key);
    }
}