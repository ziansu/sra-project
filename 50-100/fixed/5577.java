public static void native_viewFocusRequest(java.lang.Object nativeView, boolean viewFocus) {
    com.ZFFramework.Android.ZFUIKit.ZFUIView nativeViewTmp = ((com.ZFFramework.Android.ZFUIKit.ZFUIView) (nativeView));
    android.view.View viewToSet = nativeViewTmp;
    if (((nativeViewTmp.nativeImplView) != null) && (nativeViewTmp.nativeImplView.isFocusable())) {
        viewToSet = nativeViewTmp.nativeImplView;
    }
    if (viewFocus) {
        viewToSet.requestFocus();
    }else {
        viewToSet.clearFocus();
    }
}