private static boolean fragmentNameIsSecondContainer() {
    if ((tw.gov.tycg.app.android.etransportation.ui.fragment.BaseFragment.fm.getBackStackEntryCount()) > 0) {
        java.lang.String lastTag = tw.gov.tycg.app.android.etransportation.ui.fragment.BaseFragment.fm.getBackStackEntryAt(((tw.gov.tycg.app.android.etransportation.ui.fragment.BaseFragment.fm.getBackStackEntryCount()) - 1)).getName();
        android.util.Log.i("BaseFragment", lastTag);
        if (lastTag.equals(tw.gov.tycg.app.android.etransportation.ui.fragment.BACK_SECOND_CONTAINER))
            return true;
        
    }
    return false;
}