@java.lang.Override
public void onMuteStateChanged(boolean muted) {
    if (muted) {
        android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, " Self muted");
        isMute = true;
    }else {
        android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, " Self unMuted");
        isMute = false;
    }
    if ((mProxy) != null)
        mProxy.onMuteStateChanged(muted);
    
}