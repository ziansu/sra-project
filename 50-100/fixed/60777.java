@java.lang.Override
public boolean ping(edu.brown.cs.scij.network.Key key) throws edu.brown.cs.scij.network.NoSuchPlayerException {
    edu.brown.cs.scij.network.NetworkPlayer p = players.get(key);
    if (p == null) {
        if (talkative) {
            java.lang.System.out.println((("Unknown player attempted to ping with broken key " + (key.toJSONString())) + "."));
        }
        throw new edu.brown.cs.scij.network.NoSuchPlayerException();
    }
    synchronized(p) {
        p.incrementPingCount();
        p.setLastPing(serverTime);
        connect(p);
        return !(p.isUpToDate());
    }
}