@java.lang.Override
public com.github.barteksc.pdfviewer.PDFView createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    if ((pdfView) == null) {
        pdfView = new com.github.barteksc.pdfviewer.PDFView(context, null);
    }else {
        try {
            final android.view.ViewGroup parentView = ((android.view.ViewGroup) (pdfView.getParent()));
            if (parentView != null) {
                parentView.removeView(pdfView);
            }
        } catch (java.lang.ClassCastException e) {
            showLog("does not has a parent");
        }
    }
    return new com.github.barteksc.pdfviewer.PDFView(context, null);
}