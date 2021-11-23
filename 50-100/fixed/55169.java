private void connectAndAskForPermission() {
    if (!(cl.smartcities.isci.transportinspector.positionProvider.PositionProvider.getInstance().register(this, this, locationRequest))) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.ACCESS_FINE_LOCATION }, cl.smartcities.isci.transportinspector.splashScreen.SplashScreenActivity.PERMISSIONS_REQUEST_LOCATION);
    }else
        if ((timer) != null) {
            timer.schedule(new cl.smartcities.isci.transportinspector.splashScreen.SplashScreenActivity.Task(), cl.smartcities.isci.transportinspector.splashScreen.SplashScreenActivity.MAXIMUM_WAIT_TIME);
        }
    
}