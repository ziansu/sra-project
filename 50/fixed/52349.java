@java.lang.Override
public void onRemoveChannelMember(java.lang.String userId) {
    android.util.Log.d(com.toraysoft.qinjia_lib.QinjiaManager.TAG, (userId + " exit channel"));
    removeUser(userId);
    if ((mProxy) != null)
        mProxy.onRemoveChannelMember(userId);
    
}