@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.mmm.parq.fragments.HostNewSpotFragment.PLACE_AUTOCOMPLETE_REQUEST_CODE)) {
        mPlace = com.google.android.gms.location.places.ui.PlaceAutocomplete.getPlace(getActivity(), data);
        if ((mPlace) != null) {
            mAddressField.setText(mPlace.getAddress());
            android.util.Log.i(com.mmm.parq.fragments.HostNewSpotFragment.TAG, mPlace.getName().toString());
        }
    }
}