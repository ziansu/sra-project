private boolean contains(int col, @javax.annotation.Nullable
java.lang.Object o) {
    for (int i = 0; i < (elements); i++) {
        java.lang.Object c = get(col, i);
        if (((o == null) && (c == null)) || ((o != null) && (o.equals(c)))) {
            return true;
        }
    }
    return false;
}