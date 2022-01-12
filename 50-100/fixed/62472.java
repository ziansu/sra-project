@java.lang.SuppressWarnings(value = "SameParameterValue")
private static boolean hasOpt(java.util.Map<java.lang.String, java.lang.Object> opts, java.lang.String arg) {
    boolean present = false;
    if (opts.containsKey(("--" + arg))) {
        java.lang.Object val = opts.get(("--" + arg));
        if (val != null) {
            return true;
        }
    }
    return present;
}