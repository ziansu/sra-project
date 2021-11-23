public int compareTo(LFUCache.Data that) {
    if ((this.frequency) < (that.frequency)) {
        return -1;
    }else
        if ((this.frequency) == (that.frequency)) {
            return 0;
        }else {
            return 1;
        }
    
}