private java.lang.CharSequence generateEnumFieldNotPresentCondition(final int sinceVersion, final java.lang.String enumName, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((indent + "        if (_actingVersion < %d) return %s.NULL_VALUE;\n\n"), java.lang.Integer.valueOf(sinceVersion), enumName);
}