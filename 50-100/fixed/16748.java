@java.lang.Override
public void onResume() {
    super.onResume();
    toolbar.setBackgroundColor(Color.TRANSPARENT);
    if (((primaryColor) != (-1)) && ((getActivity()) != null)) {
        collapsingToolbarLayout.setContentScrimColor(primaryColor);
        com.naman14.timber.utils.ATEUtils.setFabBackgroundTint(fab, primaryColor);
        java.lang.String ateKey = com.naman14.timber.utils.Helpers.getATEKey(getActivity());
        com.naman14.timber.utils.ATEUtils.setStatusBarColor(getActivity(), ateKey, primaryColor);
    }
}