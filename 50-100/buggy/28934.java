@java.lang.Override
public void onCreate(android.os.Bundle icicle) {
    super.onCreate(icicle);
    getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
    initAdapter();
    android.graphics.drawable.Drawable d = getResources().getDrawable(R.drawable.action_bar_background);
    getActionBar().setBackgroundDrawable(d);
    getActionBar().setSplitBackgroundDrawable(d);
}