@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_location_edit1, container, false);
    checkForGooglePlayServicesAndExitIfNone();
    getCurrentlyEditedLocationReference();
    fillNullLocation();
    addOnClickActionsToButtons(rootView);
    fillLocationDetails(rootView);
    return rootView;
}