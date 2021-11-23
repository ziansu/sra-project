@java.lang.Override
public void newSubscriptionCount(int argCount) {
    boolean showEmpty = argCount == 0;
    int visibility = (showEmpty) ? android.view.View.VISIBLE : android.view.View.GONE;
    if (((mShowEmptyView) == null) || ((mShowEmptyView.booleanValue()) != showEmpty)) {
        if (showEmpty) {
            mEmptySubscrptionList.setVisibility(View.VISIBLE);
        }else {
            mEmptySubscrptionList.setVisibility(View.GONE);
        }
        mShowEmptyView = showEmpty;
    }
}