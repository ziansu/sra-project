@java.lang.Override
public void onDetach() {
    if ((serviceConnection) != null) {
        getActivity().unbindService(serviceConnection);
    }
    context = null;
    locationService = null;
    mapFragment = null;
    serviceConnection = null;
    gpsHandler = null;
    tripProcessor = null;
    super.onDetach();
    android.util.Log.d(com.example.aprokopenko.triphelper.ui.fragment.MainFragment.LOG_TAG, "onDetach: called");
}