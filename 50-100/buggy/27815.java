@java.lang.Override
public void reloadView() {
    mLevelView.removeAllViews();
    int numberItems = mLevelAdapter.getCount();
    if (numberItems > 0) {
        displayError(false);
        for (int i = 0; i < numberItems; i++) {
            android.view.View mLinearView = mLevelAdapter.getView(i, null, null);
            mLevelView.addView(mLinearView, i);
        }
    }else {
        displayError(true);
    }
}