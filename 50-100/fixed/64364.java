@java.lang.Override
public void doInitialViewsLocation() {
    mForegroundView = ((com.xenione.libs.swipemaker.SwipeLayout) (findViewById(R.id.foregroundView)));
    mBg = ((android.widget.ImageView) (findViewById(R.id.bg_disc)));
    mDelete = findViewById(R.id.delete);
    mAction = findViewById(R.id.action);
    mForegroundView.anchor(0, (-(mDelete.getRight())), (-(mAction.getRight())));
}