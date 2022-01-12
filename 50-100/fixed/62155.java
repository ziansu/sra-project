@java.lang.Override
public void onExit(boolean success) {
    android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, "logout");
    isOnline = false;
    isInChannel = false;
    isMute = false;
    isSpeak = false;
    mode = "";
    userList.clear();
    if ((mProxy) != null)
        mProxy.onExit(success);
    
}