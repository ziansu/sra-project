private void toggle(boolean toggle) {
    int color;
    if (toggle) {
        color = mActiveColor;
    }else {
        color = android.support.v4.content.res.ResourcesCompat.getColor(getResources(), R.color.defaultNotActiveCircle, null);
    }
    mDrawable.setStroke(((getMeasuredHeight()) / 30), color);
}