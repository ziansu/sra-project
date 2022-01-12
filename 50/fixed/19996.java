void build(act.util.ActContext context) {
    java.util.Set<java.lang.String> paramKeys = context.paramKeys();
    for (java.lang.String key : paramKeys) {
        java.lang.String[] vals = context.paramVals(key);
        buildNode(key, vals);
    }
}