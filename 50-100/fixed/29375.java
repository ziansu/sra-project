private void addExtendedActionMenuText() {
    if ((mMenuText) == null) {
        mMenuText = new android.widget.TextView(getContext());
        mMenuText.setText(extendedButtonText);
        mMenuText.setTextSize(mExtendedButtonTextSize);
        mMenuText.setTextColor(mExtendedButtonTextColor);
        mMenuText.setVisibility(View.GONE);
        addView(mMenuText);
    }
}