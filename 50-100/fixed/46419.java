@java.lang.Override
public void ban(com.kepler.host.Host host) {
    synchronized(this.locks.get(host)) {
        boolean baned = false;
        for (com.kepler.host.Hosts each : this.hosts.values()) {
            baned = (each.ban(host)) || baned;
        }
        if (baned) {
            this.connects.put(host);
        }
    }
}