private boolean equalsThatHandlesNull(java.lang.Object a, java.lang.Object b) {
    if ((a != null) && (b != null)) {
        if (a.equals(b)) {
            return true;
        }
    }else {
        if ((a == null) && (b == null)) {
            return true;
        }
    }
    return false;
}