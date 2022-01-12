@java.lang.Override
public void run() {
    mPager.setCurrentItem(0, false);
    org.ei.opensrp.view.fragment.SecuredNativeSmartRegisterFragment registerFragment = ((org.ei.opensrp.view.fragment.SecuredNativeSmartRegisterFragment) (findFragmentByPosition(0)));
    if ((registerFragment != null) && (data != null)) {
        registerFragment.refreshListView();
    }
    org.ei.opensrp.view.fragment.DisplayFormFragment displayFormFragment = getDisplayFormFragmentAtIndex(prevPageIndex);
    if (displayFormFragment != null) {
        displayFormFragment.hideTranslucentProgressDialog();
        displayFormFragment.setFormData(null);
        displayFormFragment.loadFormData();
    }
    displayFormFragment.setRecordId(null);
}