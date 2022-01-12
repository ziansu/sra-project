@java.lang.Override
public void reloadView() {
    mLevelView.removeAllViews();
    for (int i = 0; i < (mLevelAdapter.getCount()); i++) {
        android.view.View mLinearView = mLevelAdapter.getView(i, null, null);
        mLevelView.addView(mLinearView, i);
    }
}