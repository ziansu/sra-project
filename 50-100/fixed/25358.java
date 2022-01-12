public java.lang.String varbindsToString() {
    java.lang.String s = "[";
    for (int i = 0; i < (varbind.size()); i++) {
        s += varbind.get(i).toString();
        if (i < ((varbind.size()) - 1)) {
            s += ", ";
        }
    }
    s += "]";
    return s;
}