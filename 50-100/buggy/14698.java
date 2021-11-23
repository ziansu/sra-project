private void configPopupWindow() {
    mPopupWindow = new android.support.v7.widget.AppCompatPopupWindow(mContext, null, io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip.mDefaultPopupWindowStyleRes);
    mPopupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
    mPopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
    mPopupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.TRANSPARENT));
    mPopupWindow.setClippingEnabled(false);
    mPopupWindow.setOnDismissListener(this);
    if ((mDismissOnInsideTouch) || (mDismissOnOutsideTouch))
        mPopupWindow.setTouchInterceptor(mPopupWindowsTouchListener);
    
}