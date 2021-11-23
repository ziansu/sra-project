private <T> void pA(T[] a) {
    java.lang.String out = "{" + (a[0]);
    for (int i = 1; i < (a.length); i++) {
        out += ", " + (a[i]);
    }
    out += "}";
    java.lang.System.out.println(out);
}