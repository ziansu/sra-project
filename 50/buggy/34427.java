public void onLowMemory() {
    info("onLowMemory");
    com.androidquery.callback.BitmapAjaxCallback.clearCache();
    cs.java.lang.Lang.application().logger().onLowMemory();
    super.onLowMemory();
}