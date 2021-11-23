public void setInactiveColor(int inActiveColor) {
    mInActiveColor = inActiveColor;
    labelView.setTextColor(inActiveColor);
    android.support.v4.graphics.drawable.DrawableCompat.setTint(mCompactIcon, inActiveColor);
    iconView.setImageDrawable(mCompactIcon);
}