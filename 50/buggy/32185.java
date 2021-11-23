public void stopRing() {
    if (com.android.phone.Ringer.DBG)
        com.android.phone.Ringer.log("stopRing()...");
    
    getRingHandler().removeCallbacksAndMessages(null);
    getRingHandler().sendMessageAtFrontOfQueue(getRingHandler().obtainMessage(com.android.phone.Ringer.RingHandler.MSG_STOP));
}