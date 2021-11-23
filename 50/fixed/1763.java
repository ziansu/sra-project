@java.lang.Override
public void run() {
    android.util.Log.d("CALL_INTEGRATION", "CallActivity. initRejectCallTask lunched");
    cancelPlayer();
    videoChatHelper.rejectCall(userInfo);
}