public void setLength(long l, boolean serialize, boolean propigateEvent) {
    long len = l - (this.length);
    Main.volume.updateCurrentSize(len, true);
    this.length = l;
    this.dirty = true;
    if (serialize)
        this.unmarshal();
    
}