private void setTimer(long seqNo) {
    com.rdt.TimeoutTimerTask ttt = new com.rdt.TimeoutTimerTask(seqNo, java.lang.System.currentTimeMillis(), timeoutInterval);
    ttt.subscribe(this);
    timeoutMap.put(seqNo, ttt);
    com.rdt.ConnectionHandler.TIMER.schedule(ttt, timeoutInterval);
}