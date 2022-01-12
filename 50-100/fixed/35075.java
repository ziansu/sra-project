@java.lang.Override
public int compare(java.lang.Object a, java.lang.Object b) {
    int ax = java.lang.Integer.parseInt(java.lang.String.valueOf(this.base.get(a)));
    int bx = java.lang.Integer.parseInt(java.lang.String.valueOf(this.base.get(b)));
    if (ax < bx)
        return 1;
    
    if (ax == bx) {
        return 0;
    }
    return -1;
}