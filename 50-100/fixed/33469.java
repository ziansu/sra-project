private void parse() {
    if ((str) == null) {
        return ;
    }
    java.lang.String[] kvs = str.split("; ");
    for (java.lang.String kv : kvs) {
        java.lang.String[] ks = kv.split("=");
        cookies.put(ks[0], ks[1]);
    }
}