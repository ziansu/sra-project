@java.lang.Override
public void onHiddenChanged(boolean hidden) {
    super.onHiddenChanged(hidden);
    if (!hidden) {
        onShow();
    }else {
        onHide();
    }
    java.util.List<com.floern.android.app.Fragment> childFragments = getChildFragmentManager().getFragments();
    if (childFragments != null) {
        for (com.floern.android.app.Fragment childFragment : childFragments) {
            if (childFragment != null) {
                childFragment.onHiddenChanged(hidden);
            }
        }
    }
}