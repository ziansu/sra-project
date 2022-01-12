public int compare(java.lang.Object a, java.lang.Object b) {
    double ax = java.lang.Integer.parseInt(java.lang.String.valueOf(this.base.get(a)));
    double bx = java.lang.Integer.parseInt(java.lang.String.valueOf(this.base.get(b)));
    if (ax < bx)
        return 1;
    
    if (ax == bx) {
        return 0;
    }
    return -1;
}