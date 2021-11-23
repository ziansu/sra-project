private android.view.ViewGroup.LayoutParams getEditorParams() {
    android.view.WindowManager.LayoutParams lp = new android.view.WindowManager.LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.MATCH_PARENT, android.view.ViewGroup.LayoutParams.TYPE_NAVIGATION_BAR_PANEL, (((((android.view.ViewGroup.LayoutParams.FLAG_LAYOUT_IN_SCREEN) | (android.view.ViewGroup.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH)) | (android.view.ViewGroup.LayoutParams.FLAG_LAYOUT_NO_LIMITS)) | (android.view.ViewGroup.LayoutParams.FLAG_LAYOUT_INSET_DECOR)) | (android.view.ViewGroup.LayoutParams.FLAG_SPLIT_TOUCH)), android.graphics.PixelFormat.TRANSLUCENT);
    lp.flags |= android.view.ViewGroup.LayoutParams.FLAG_HARDWARE_ACCELERATED;
    lp.gravity = android.view.Gravity.BOTTOM;
    lp.setTitle("SmartBar Editor");
    lp.softInputMode = (android.view.ViewGroup.LayoutParams.SOFT_INPUT_STATE_UNCHANGED) | (android.view.ViewGroup.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
    lp.windowAnimations = com.android.internal.R.style.PowerMenuBottomAnimation;
    return lp;
}