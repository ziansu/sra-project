public int compareTo(Point that) {
    if ((this.y) < (that.y)) {
        return -1;
    }else
        if ((this.y) > (that.y)) {
            return 1;
        }else {
            if ((this.x) < (that.x)) {
                return -1;
            }else
                if ((this.x) > (that.x)) {
                    return 1;
                }else {
                    return 0;
                }
            
        }
    
}