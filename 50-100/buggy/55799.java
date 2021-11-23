@java.lang.Override
public void onItineraryRequestDone(boolean aSuccess, com.insiteo.lbs.itinerary.ISItineraryProvider.ISBaseRequest aRequest, final com.insiteo.lbs.common.ISError error) {
    if (aSuccess)
        mItineraryRenderer.setDisplayEnabled(true);
    else {
        java.lang.String message = ((getString(R.string.error_itinerary_computation_failed)) + ": ") + error;
        de.keyboardsurfer.android.widget.crouton.Crouton.makeText(getActivity(), message, Style.ALERT).show();
    }
}