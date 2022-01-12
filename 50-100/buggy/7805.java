public java.util.ArrayList<java.lang.Boolean> asList() {
    java.util.ArrayList<java.lang.Boolean> l = new java.util.ArrayList<java.lang.Boolean>(length);
    for (int i = 0; i < (length); i++) {
        l.set(i, get(i));
    }
    return l;
}