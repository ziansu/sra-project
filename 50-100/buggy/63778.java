@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_devices_scan);
    com.example.linquas.myapplication.DevicesScanActivity.mDevicesScanActivity = this;
    manager = ((android.location.LocationManager) (getSystemService(com.example.linquas.myapplication.LOCATION_SERVICE)));
    android.os.AsyncTask t = new com.example.linquas.myapplication.getLocation(this).execute(com.example.linquas.myapplication.DevicesScanActivity.LINK);
    android.os.AsyncTask t2 = new com.example.linquas.myapplication.getLocation(this).execute(com.example.linquas.myapplication.DevicesScanActivity.LINK2);
    mRecyclerView = ((android.support.v7.widget.RecyclerView) (findViewById(R.id.my_recycler_view)));
    mRecyclerView.setHasFixedSize(true);
    com.example.linquas.myapplication.DevicesScanActivity.sDeviceList.add(0, null);
}