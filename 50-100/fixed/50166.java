public void setMinionUntrusted(java.lang.String ipAddress) throws exceptions.UnregisteredMinion {
    monitor.Minion trustedMinion = trustedMinions.remove(ipAddress);
    if (trustedMinion != null) {
        untrustedMinions.put(ipAddress, trustedMinion);
        this.trustedMinionsArray = trustedMinions.entrySet().toArray();
        return ;
    }
    throw new exceptions.UnregisteredMinion(("Cannot untrusted unregistered minion:" + ipAddress));
}