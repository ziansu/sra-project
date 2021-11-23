@java.lang.Override
public void newSubscriptionCount(int argCount) {
    boolean showEmpty = argCount == 0;
    if (((mShowEmptyView) == null) || ((mShowEmptyView) != showEmpty)) {
        if (showEmpty) {
            mEmptySubscrptionList.setVisibility(View.VISIBLE);
        }else {
            mEmptySubscrptionList.setVisibility(View.GONE);
        }
        mShowEmptyView = showEmpty;
    }
}