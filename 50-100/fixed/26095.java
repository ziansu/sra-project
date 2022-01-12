@java.lang.Override
public void onStart() {
    super.onStart();
    getActivity().getPreferences(Context.MODE_PRIVATE).registerOnSharedPreferenceChangeListener(this);
    mDeviceInfoMessage = com.google.android.gms.nearby.messages.samples.nearbydevices.DeviceMessage.newNearbyMessage(com.google.android.gms.iid.InstanceID.getInstance(getActivity().getApplicationContext()).getId());
    mGoogleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addApi(Nearby.MESSAGES_API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
    mGoogleApiClient.connect();
}