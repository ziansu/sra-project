private java.lang.Integer getHeartbeat() {
    com.billybyte.meteorjava.MeteorListSendReceive<M>.ReceiveHeartbeatObserver observer = new ReceiveHeartbeatObserver();
    java.lang.Object[] params = null;
    java.lang.Integer ret = callMeteorSynchronously("heartbeat", params, observer);
    return ret;
}