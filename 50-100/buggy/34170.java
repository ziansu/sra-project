private com.bodyworks.zihudaily.homenews.event.ShareElementCallbackEvent createShareElementEvent() {
    if ((shareBitmap) != null) {
        android.graphics.Bitmap bitmap;
        try {
            android.graphics.Rect rect = new android.graphics.Rect();
            titleImage.getGlobalVisibleRect(rect);
            bitmap = com.bodyworks.lib_commen_sdk.utils.ConvertUtils.drawableToBitmap(titleImage.getDrawable());
            return new com.bodyworks.zihudaily.homenews.event.ShareElementCallbackEvent(bitmap, rect.height());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return null;
}