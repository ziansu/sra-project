private int countActiveQueues(int routerGroup) {
    int active = 0;
    java.util.Set<java.lang.Integer> peers = null;
    if (routerGroup == (-1)) {
        peers = this.incUpdateQueues.keySet();
    }else {
        peers = this.routerBindings.get(routerGroup);
    }
    for (int tASN : peers) {
        if (!(this.incUpdateQueues.get(tASN).isEmpty())) {
            active++;
        }
    }
    return active;
}