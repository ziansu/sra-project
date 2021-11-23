private java.lang.CharSequence generateArrayFieldNotPresentCondition(final int sinceVersion, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((indent + "        if (actingVersion < %d) return 0;\n\n"), java.lang.Integer.valueOf(sinceVersion));
}