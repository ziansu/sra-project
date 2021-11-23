private java.lang.CharSequence generateTypeFieldNotPresentCondition(final int sinceVersion, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((((((((indent + "        if (actingVersion_ < %1$d)\n") + indent) + "        {\n") + indent) + "            return NULL;\n") + indent) + "        }\n\n"), sinceVersion);
}