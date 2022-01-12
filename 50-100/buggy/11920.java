private void firePrefixOrSuffix(java.lang.String key) {
    for (java.lang.String k : new java.util.LinkedList(callbacksByMatch.keySet())) {
        if (k.startsWith(key)) {
            fireMatch(key, Match.PREFIX);
        }
        if (k.endsWith(key)) {
            fireMatch(key, Match.SUFFIX);
        }
    }
}