@java.lang.Override
public void onDetach() {
    super.onDetach();
    if ((serviceConnection) != null) {
        getActivity().unbindService(serviceConnection);
    }
    context = null;
    locationService = null;
    mapFragment = null;
    serviceConnection = null;
    gpsHandler = null;
    tripProcessor = null;
    android.util.Log.d(com.example.aprokopenko.triphelper.ui.fragment.MainFragment.LOG_TAG, "onDetach: called");
}