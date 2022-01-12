private java.lang.CharSequence generateEnumFieldNotPresentCondition(final int sinceVersion, final java.lang.String enumName, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((((indent + "        if self.actingVersion_ < %1$d:\n") + indent) + "            return %2$s.Value.NULL_VALUE\n"), sinceVersion, enumName);
}