public void renderPage(com.shockwave.pdfium.PdfDocument doc, android.view.Surface surface, int pageIndex) {
    synchronized(doc.Lock) {
        try {
            int dpi = mContext.getResources().getDisplayMetrics().densityDpi;
            nativeRenderPage(doc.mNativePagesPtr.get(pageIndex), surface, dpi);
        } catch (java.lang.NullPointerException e) {
            android.util.Log.e(com.shockwave.pdfium.PdfiumCore.TAG, "mContext may be null");
        } catch (java.lang.Exception e) {
            android.util.Log.e(com.shockwave.pdfium.PdfiumCore.TAG, "Exception throw from native");
            e.printStackTrace();
        }
    }
}