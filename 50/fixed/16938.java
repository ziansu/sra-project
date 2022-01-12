public java.lang.Integer getPromoterEnd(int upstream, int downstream) {
    if (strand.equals("+")) {
        return (start) + downstream;
    }else {
        return (end) + upstream;
    }
}