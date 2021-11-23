public java.lang.Integer getPromoterStart(int upstream, int downstream) {
    if (strand.equals("+")) {
        return (start) - upstream;
    }else {
        return end;
    }
}