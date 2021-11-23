@java.lang.Override
public void onBeaconStoppedSeeking() {
    android.widget.Toast.makeText(mActivity, "Beacon stopped", Toast.LENGTH_SHORT).show();
    android.util.Log.d("BEACON", "Beacon stopped");
}