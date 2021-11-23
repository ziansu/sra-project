@java.lang.Override
public void onDestroy() {
    stopService(new android.content.Intent(this, techkids.com.android9_hackathon2_breakworkout.BroadcastService.class));
    android.util.Log.i(techkids.com.android9_hackathon2_breakworkout.views.AlarmScene.TAG, "Stopped service");
    super.onDestroy();
}