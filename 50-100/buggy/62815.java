private void _showMyAccountLoadedFragment(rx.subjects.PublishSubject<com.objectivetruth.uoitlibrarybooking.data.models.usermodel.MyAccountSignoutEvent> signoutEventPublishSubject, com.objectivetruth.uoitlibrarybooking.data.models.usermodel.MyAccountDataLoginState myAccountDataLoginState) {
    java.lang.String MY_ACCOUNT_LOADED_FRAGMENT_TAG = "SINGLETON_MY_ACCOUNT_LOADED_FRAGMENT_TAG";
    getActivity().invalidateOptionsMenu();
    getChildFragmentManager().beginTransaction().replace(R.id.my_account_content_frame, com.objectivetruth.uoitlibrarybooking.userinterface.myaccount.myaccountloaded.MyAccountLoaded.newInstance(userModel, myAccountDataLoginState, this), MY_ACCOUNT_LOADED_FRAGMENT_TAG).addToBackStack(null).commit();
}