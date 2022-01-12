public int compareTo(hengxiu.courseraPA.w3.Point that) {
    if ((that.y) == (y)) {
        if ((that.x) == (x)) {
            return 1;
        }else {
            return (x) - (that.x);
        }
    }else {
        return (y) - (that.y);
    }
}