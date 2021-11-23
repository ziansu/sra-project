public int compareTo(hengxiu.courseraPA.w3.Point that) {
    if (that == null) {
        throw new java.lang.NullPointerException();
    }
    if ((that.y) == (y)) {
        if ((that.x) == (x)) {
            return 0;
        }else {
            return (x) - (that.x);
        }
    }else {
        return (y) - (that.y);
    }
}