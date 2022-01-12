private java.lang.String getCurrentTab() {
    try {
        android.widget.ViewFlipper flipper = ((android.widget.ViewFlipper) (pager.getChildAt(((pager.getCurrentItem()) - 1))));
        android.webkit.WebView tab = ((android.webkit.WebView) (((android.support.v4.widget.NestedScrollView) (flipper.getChildAt(1))).getChildAt(0)));
        return tab.getUrl();
    } catch (java.lang.Exception e) {
        return null;
    }
}