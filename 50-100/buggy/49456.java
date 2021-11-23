@java.lang.Override
public void onProviderEnabled(java.lang.String provider) {
    checkEnabled();
    try {
        showLocation(locationManager.getLastKnownLocation(provider));
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
        android.widget.Toast toast = android.widget.Toast.makeText(getActivity().getApplicationContext(), ("SecurityException:" + (e.toString())), Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }
}