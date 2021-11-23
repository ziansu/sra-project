protected java.util.List<java.lang.String> createPackageList(java.util.List<java.lang.String> pkgs, java.lang.String code, java.lang.String delim) {
    java.util.List<java.lang.String> pkg = new java.util.ArrayList<java.lang.String>(pkgs);
    if (code != null) {
        java.lang.String[] codes = code.split(delim);
        for (java.lang.String c : codes) {
            pkg.add(c);
        }
    }
    return pkg;
}