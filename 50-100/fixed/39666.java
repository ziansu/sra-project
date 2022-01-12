@java.lang.Override
public boolean onMyLocationButtonClick() {
    if ((mMap.getMyLocation()) != null) {
        android.location.Location myLocation = mMap.getMyLocation();
        android.widget.Toast.makeText(getActivity(), ("" + (myLocation.getLatitude())), Toast.LENGTH_SHORT).show();
    }
    return false;
}