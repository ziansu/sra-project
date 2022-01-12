public int size() {
    int size;
    size = this.segments.size();
    for (org.pb.x12.Loop l : this.childList()) {
        size += l.size();
    }
    return size;
}