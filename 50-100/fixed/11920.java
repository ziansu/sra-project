private void firePrefixOrSuffix(java.lang.String key) {
    for (java.lang.String k : new java.util.LinkedList(callbacksByMatch.keySet())) {
        if (key.startsWith(k)) {
            fireMatch(key, Match.PREFIX);
        }
        if (key.endsWith(k)) {
            fireMatch(key, Match.SUFFIX);
        }
    }
}