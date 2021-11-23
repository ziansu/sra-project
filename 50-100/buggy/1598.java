private void setTimer(com.rdt.Packet pkt, long seqNo) {
    if (timeoutMap.containsKey(seqNo)) {
        timeoutMap.remove(seqNo).cancel();
    }
    com.rdt.TimeoutTimerTask ttt = new com.rdt.TimeoutTimerTask(seqNo, java.lang.System.currentTimeMillis(), timeoutInterval, pkt);
    ttt.subscribe(this);
    timeoutMap.put(seqNo, ttt);
    com.rdt.ConnectionHandler.TIMER.schedule(ttt, timeoutInterval);
}