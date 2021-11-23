@java.lang.Override
public void onLocationStartedSeeking() {
    android.widget.Toast.makeText(mActivity, "Tracking started", Toast.LENGTH_SHORT).show();
    android.util.Log.d("LOCATION", "Tracking started");
    if (mAdapt) {
        com.akturk.plugin.adapter.TargetListAdapter adaptList = mGson.fromJson(mRawData, com.akturk.plugin.adapter.TargetListAdapter.class);
        mData = adaptList.adapt();
    }else {
        mData = mGson.fromJson(mRawData, com.akturk.plugin.model.TargetList.class);
    }
    com.unity3d.player.UnityPlayer.UnitySendMessage("LOCATIONCHECKER", "OnLocationStartedSeeking", "");
}