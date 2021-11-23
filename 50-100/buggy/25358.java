public java.lang.String varbindsToString() {
    java.lang.String s = "[";
    for (int i = 0; i < (varbind.size()); i++) {
        s += ((varbind.get(i).getOid()) + "=") + (varbind.get(i).getValue());
        if (i < (varbind.size())) {
            s += ", ";
        }
    }
    s += "]";
    return s;
}