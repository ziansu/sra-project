@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    android.support.v4.app.ActivityCompat.requestPermissions(getActivity(), new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, com.example.darknight.mi2016.MapFragment.MY_PERMISSIONS_REQUEST_LOCATION);
}