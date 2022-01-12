public static java.util.HashSet<java.lang.String> csvToHashSet(java.lang.String csv) {
    java.util.HashSet<java.lang.String> ret = new java.util.HashSet<java.lang.String>();
    if (csv != null) {
        for (java.lang.String v : csv.split(",")) {
            if ((v != null) && ((v.length()) > 0))
                ret.add(v);
            
        }
    }
    return ret;
}