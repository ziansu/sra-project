private boolean unprotect(me.newyith.util.Point p) {
    boolean unprotected = false;
    if (this.protectedPoints.contains(p)) {
        this.protectedPoints.remove(p);
    }
    return unprotected;
}