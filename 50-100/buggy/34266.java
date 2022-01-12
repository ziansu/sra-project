public boolean isValid() {
    java.util.ArrayList<topology.HostMapping> tmp = new java.util.ArrayList<topology.HostMapping>();
    for (topology.HostMapping h : tmp) {
        if (!(h.isValid())) {
            hosts.remove(h);
        }
    }
    if (((java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis())) - (created)) > (ttl)) {
        return false;
    }
    return true;
}