public void onDestroy() {
    super.onDestroy();
    mMapView.onDestroy();
    if ((mConnection) != null)
        doUnbindService();
    
}