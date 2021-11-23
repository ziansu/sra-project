private java.lang.String regexpFormatFixup(java.lang.String originRegexp) {
    java.lang.String fixedupRegexp = originRegexp;
    fixedupRegexp = extendedRegexpFixup(fixedupRegexp);
    fixedupRegexp = collectionFixedup(fixedupRegexp);
    debugPrint(("after collectionFixedup: " + fixedupRegexp));
    return fixedupRegexp;
}