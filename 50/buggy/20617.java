@java.lang.Override
public void onResume() {
    super.onResume();
    if (!(helpers.GooglePlayHelper.isGPSEnabled(getActivity()))) {
        helpers.GooglePlayHelper.buildAlertMessageNoGps(getActivity());
    }
    helpers.GooglePlayHelper.isPlayServiceAvailable(getActivity());
}