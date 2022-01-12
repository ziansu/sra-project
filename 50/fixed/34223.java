@java.lang.Override
public void onStart() {
    super.onStart();
    com.lkworm.miniservice.GPSTrackService.StartService(this);
    android.util.Log.d(com.lkworm.miniservice.MainActivity.TAG, "onStart");
}