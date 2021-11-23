private com.kepler.org.apache.commons.collections.map.MultiKeyMap exchange() {
    this.minute.set(this.minute());
    this.indexes.incrementAndGet();
    return this.clear().prev();
}