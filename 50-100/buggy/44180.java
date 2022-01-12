private void startFindNearestNodesService() {
    int permissionCheck = android.support.v4.content.ContextCompat.checkSelfPermission(this.getActivity(), Manifest.permission.ACCESS_FINE_LOCATION);
    if (permissionCheck == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.content.Intent intent = new android.content.Intent(getActivity(), com.example.tobiastrumm.freifunkautoconnect.FindNearestNodesService.class);
        getActivity().startService(intent);
    }else {
        android.support.v13.app.FragmentCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_FINE_LOCATION }, com.example.tobiastrumm.freifunkautoconnect.NearestNodesFragment.PERMISSION_REQUEST_FINE_LOCATION);
    }
}