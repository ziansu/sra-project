public void addFragmentOnSecondContainer(android.support.v4.app.Fragment fragment, boolean addToBackStack) {
    tw.gov.tycg.app.android.etransportation.ui.fragment.BaseFragment.initFragmentTransaction();
    if (addToBackStack)
        tw.gov.tycg.app.android.etransportation.ui.fragment.BaseFragment.ft.add(R.id.second_container, fragment).addToBackStack(tw.gov.tycg.app.android.etransportation.ui.fragment.BACK_SECOND_CONTAINER).commit();
    else
        tw.gov.tycg.app.android.etransportation.ui.fragment.BaseFragment.ft.replace(R.id.second_container, fragment).commit();
    
}