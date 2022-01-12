public java.lang.String toString() {
    java.util.SortedSet<java.lang.String> keysArray = new java.util.TreeSet<java.lang.String>(logLikelihoodMap.keySet());
    java.lang.String toRet = "";
    for (java.lang.String key : keysArray) {
        double logLike = logLikelihoodMap.get(key);
        java.lang.String logLikeS = java.lang.Double.toString(logLike);
        java.lang.String thisKey = ((key + "     ") + logLikeS) + "\n";
        toRet += thisKey;
    }
    java.lang.System.out.println(toRet);
    return toRet;
}