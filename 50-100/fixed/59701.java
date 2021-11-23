protected int load(long address) {
    if (this.containsBlock(address)) {
        int way = this.findBlock(address);
        this.updateLRU(way);
        return hitLatency;
    }else {
        int cost = this.evictIfNeeded(address);
        int way = this.findBlock(address);
        this.setTag(way, address);
        this.setValid(way, true);
        this.updateLRU(way);
        return cost;
    }
}