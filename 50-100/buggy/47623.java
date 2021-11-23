@java.lang.Override
public void onHiddenChanged(boolean hidden) {
    super.onHiddenChanged(hidden);
    if (!hidden) {
        onShow();
    }else {
        onHide();
    }
    java.util.List<com.floern.android.app.Fragment> childFragments = getChildFragmentManager().getFragments();
    for (com.floern.android.app.Fragment childFragment : childFragments) {
        childFragment.onHiddenChanged(hidden);
    }
}