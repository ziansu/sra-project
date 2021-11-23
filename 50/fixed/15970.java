private void closeRenderer() {
    if ((renderer) == null) {
        android.util.Log.w(com.bjss.plugin.PdfRendererPlugin.LOG_TAG, "Attempted to close null renderer. Skipping operation.");
        return ;
    }
    renderer.close();
}