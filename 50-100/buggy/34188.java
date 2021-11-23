public void setMinionTrusted(java.lang.String ipAddress) throws exceptions.UnregisteredMinion {
    monitor.Minion untrustedMinion = untrustedMinions.remove(ipAddress);
    if (untrustedMinion != null) {
        trustedMinions.put(ipAddress, untrustedMinion);
        this.trustedMinionsArray = trustedMinions.entrySet().toArray();
    }
    throw new exceptions.UnregisteredMinion(("Cannot trust unregistered minion:" + ipAddress));
}