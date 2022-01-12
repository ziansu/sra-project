@java.lang.Override
public void run() {
    final java.util.List<java.lang.Integer> opponents = new java.util.ArrayList<>();
    opponents.add(opponent.getUserId());
    android.util.Log.d("CALL_INTEGRATION", "CallActivity. initStartCallTask lunched");
    videoChatHelper.startCall(userInfo, opponents, call_type);
}