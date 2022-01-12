public boolean equals(java.lang.Object x) {
    if (x instanceof mountain.Side) {
        mountain.Side s = ((mountain.Side) (x));
        if (((p1.equals(s.p1)) && (p2.equals(s.p2))) || ((p1.equals(s.p2)) && (p2.equals(s.p1)))) {
            return true;
        }
    }
    return false;
}