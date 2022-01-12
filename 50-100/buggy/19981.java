private java.lang.Runnable initStartCallTask() {
    final java.util.List<java.lang.Integer> opponents = new java.util.ArrayList<>();
    opponents.add(opponent.getUserId());
    return new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.util.Log.d("CALL_INTEGRATION", "CallActivity. initStartCallTask lunched");
            videoChatHelper.startCall(userInfo, opponents, call_type);
        }
    };
}