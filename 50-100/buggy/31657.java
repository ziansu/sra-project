protected void addRippleToView(android.view.ViewGroup vContainer) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.LOLLIPOP)) {
        vContainer.setBackgroundResource(getItemSelectorId());
    }else {
        android.util.TypedValue outValue = new android.util.TypedValue();
        mContext.getTheme().resolveAttribute(R.attr.selectableItemBackground, outValue, true);
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            android.graphics.drawable.Drawable drawable = android.support.v4.content.ContextCompat.getDrawable(getContext(), outValue.resourceId);
            vContainer.setForeground(drawable);
        }else {
            vContainer.setBackgroundResource(outValue.resourceId);
        }
    }
}