private boolean matchesAtFrontNoRegex(final java.lang.String pkg) {
    final boolean result;
    if (pkg.startsWith(fullPackage)) {
        result = ((pkg.length()) == (fullPackage.length())) || ('.' == (pkg.charAt(fullPackage.length())));
    }else {
        result = false;
    }
    return result;
}