public static java.lang.String chooseFile(java.lang.String[] prefixes, java.lang.String name) {
    for (java.lang.String loc : prefixes) {
        if ((loc.charAt(loc.length())) != (java.io.File.separator)) {
            loc += java.io.File.separator;
        }
        java.io.File f = new java.io.File((loc + name));
        if (f.exists()) {
            return loc;
        }
    }
    return null;
}