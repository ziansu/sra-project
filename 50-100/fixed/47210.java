private <T> java.lang.String pA(java.util.List<T> a) {
    java.lang.String out = "{" + (a.get(0));
    for (int i = 1; i < (a.size()); i++) {
        out += ", " + (a.get(i));
    }
    out += "}";
    return out;
}