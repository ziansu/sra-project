public void switchState(final boolean showAnimation) {
    if (showAnimation) {
        final int childCount = getChildCount();
        for (int i = 1; i < childCount; i++) {
            bindChildAnimation(getChildAt(i));
        }
        bindCenterViewAnimation(getChildAt(0));
    }
    mExpanded = !(mExpanded);
}