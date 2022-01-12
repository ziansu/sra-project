public int compareTo(ClosestPair.Point p) {
    if ((this.x) == (p.x))
        if ((this.y) == (p.y)) {
            return 0;
        }else {
            if ((this.y) > (p.y)) {
                return 1;
            }else {
                return -1;
            }
        }
    else {
        if ((this.x) > (p.x)) {
            return 1;
        }else {
            return -1;
        }
    }
}