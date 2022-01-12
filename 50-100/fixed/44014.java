public int compareTo(LFUCache.Data that) {
    if ((this.frequency) < (that.frequency)) {
        return -1;
    }else
        if ((this.frequency) == (that.frequency)) {
            if ((this.index) < (that.index)) {
                return -1;
            }else
                if ((this.index) > (that.index)) {
                    return 1;
                }else {
                    return 0;
                }
            
        }else {
            return 1;
        }
    
}