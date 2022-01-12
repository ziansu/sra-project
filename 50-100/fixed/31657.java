protected void addRippleToView(android.view.ViewGroup vContainer) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.LOLLIPOP)) {
        vContainer.setBackgroundResource(getItemSelectorId());
    }else {
        android.util.TypedValue outValue = new android.util.TypedValue();
        mContext.getTheme().resolveAttribute(R.attr.selectableItemBackground, outValue, true);
        vContainer.setBackgroundResource(outValue.resourceId);
    }
}