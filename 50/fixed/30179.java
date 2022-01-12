@java.lang.Override
public void stopScanning() {
    super.stopScanning();
    if ((timerResortList) != null) {
        timerResortList.cancel();
        timerResortList.purge();
    }
    android.util.Log.e(io.ap1.libap1beaconmngt.ServiceBeaconManagement.TAG, "stopScanning: timer canceled");
}