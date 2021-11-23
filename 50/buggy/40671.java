public void resumeRing() {
    if (com.android.phone.Ringer.DBG)
        com.android.phone.Ringer.log("resumeRing()...");
    
    getRingHandler().sendEmptyMessage(com.android.phone.Ringer.RingHandler.MSG_RESUME);
}