synchronized void notifyObserver(boolean isStateCall, java.lang.Object... arg) {
    synchronized(this) {
        if (((observer) == null) || ((!isStateCall) && (!(observer.isActivedObserver()))))
            return ;
        
    }
    nextSequenceId();
    android.os.Message msg = com.virtualightning.library.simple2develop.state.MainLoopCall.getInstance().obtainMessage();
    msg.what = MainLoopCall.MSG_STATE_UPDATE;
    msg.arg1 = sequenceId;
    msg.obj = new java.lang.Object[]{ this , arg };
    msg.sendToTarget();
}