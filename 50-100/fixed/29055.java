public static boolean shouldReadConditionally(java.util.List list, java.lang.Object opts) {
    if ((opts instanceof clojure.lang.IPersistentMap) && (clojure.lang.RT.booleanCast(((clojure.lang.IPersistentMap) (opts)).valAt(clojure.lang.LispReader.PRESERVE_READ_COND))))
        return false;
    
    java.lang.Object first = list.get(0);
    return (clojure.lang.LispReader.READ_COND.equals(first)) || (clojure.lang.LispReader.READ_COND_SPLICING.equals(first));
}