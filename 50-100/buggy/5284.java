@java.lang.Override
public void onSystemUiVisibilityChange(int visibility) {
    android.util.Log.d("BackEnd", ("mDecorView.SYSTEM_UI_FLAG_HIDE_NAVIGATION value : " + (mDecorView.SYSTEM_UI_FLAG_HIDE_NAVIGATION)));
    boolean visible = (visibility & (mDecorView.SYSTEM_UI_FLAG_HIDE_NAVIGATION)) == 0;
    controlsView.animate().alpha((visible ? 1 : 0)).translationY((visible ? 0 : controlsView.getHeight()));
}