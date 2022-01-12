@java.lang.Override
public int size() {
    return (this.toEnd ? this.listMap.size() : (this.toEntry) + 1) - (this.fromStart ? 0 : this.fromEntry);
}