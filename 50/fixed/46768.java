@com.facebook.react.uimanager.annotations.ReactProp(name = "rtl")
public void setRtl(com.facebook.react.views.toolbar.ReactToolbar view, boolean rtl) {
    view.setLayoutDirection((rtl ? android.util.LayoutDirection.RTL : android.util.LayoutDirection.LTR));
}