@java.lang.Override
public void onSystemUiVisibilityChange(int visibility) {
    boolean visible = (visibility & (mDecorView.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) == 0;
    controlsView.animate().alpha((visible ? 1 : 0)).translationY((visible ? 0 : controlsView.getHeight()));
}