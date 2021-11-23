public void addOpponentsFragmentWithDelay() {
    stoptIncomingCallTimer();
    android.os.HandlerThread handlerThread = new android.os.HandlerThread(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.ADD_OPPONENTS_FRAGMENT_HANDLER);
    handlerThread.start();
    new android.os.Handler(handlerThread.getLooper()).postAtTime(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            getFragmentManager().beginTransaction().replace(R.id.fragment_container, new com.quickblox.sample.videochatwebrtcnew.fragments.OpponentsFragment(), com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.OPPONENTS_CALL_FRAGMENT).commit();
            currentSession = null;
        }
    }, ((android.os.SystemClock.uptimeMillis()) + (java.util.concurrent.TimeUnit.SECONDS.toMillis(com.quickblox.sample.videochatwebrtcnew.activities.CallActivity.TIME_BEGORE_CLOSE_CONVERSATION_FRAGMENT))));
}