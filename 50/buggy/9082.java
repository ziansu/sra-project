public void onPing(int evasiveTimeout, int expiredTimeout) {
    long now = java.lang.System.currentTimeMillis();
    evasiveAt = now + evasiveTimeout;
    expiredAt = now + expiredTimeout;
    state = org.jyre.ZrePeer.State.READY;
}