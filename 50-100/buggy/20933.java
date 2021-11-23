private java.lang.CharSequence generateEnumFieldNotPresentCondition(final int sinceVersion, final java.lang.String enumName, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((((((((indent + "        if (actingVersion_ < %1$d)\n") + indent) + "        {\n") + indent) + "            return %2$s::NULL_VALUE;\n") + indent) + "        }\n\n"), java.lang.Integer.valueOf(sinceVersion), enumName);
}