@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    com.taobao.weex.WXSDKEngine.getIWXImgLoaderAdapter().setImage(null, this, null, null, null);
}