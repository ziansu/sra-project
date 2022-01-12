@java.lang.Override
public void onGetChannelMember(java.lang.String userId) {
    android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, ("onGetChannelMember " + userId));
    addUser(userId);
    if ((mProxy) != null)
        mProxy.onGetChannelMember(userId);
    
}