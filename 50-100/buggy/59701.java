protected int load(long address) {
    if (set.containsBlock(address)) {
        int way = set.findBlock(address);
        set.updateLRU(way);
        return hitLatency;
    }else {
        int cost = set.evictIfNeeded(address);
        int way = set.findBlock(address);
        set.setTag(way, address);
        set.setValid(way, true);
        set.updateLRU(way);
        return cost;
    }
}