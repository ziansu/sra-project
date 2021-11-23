private int getPageCount() {
    android.util.Log.d(com.bjss.plugin.PdfRendererPlugin.LOG_TAG, "getPageCount");
    if ((renderer) == null)
        return 0;
    
    return renderer.getPageCount();
}