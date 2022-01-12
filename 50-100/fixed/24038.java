private java.lang.CharSequence generateFieldNotPresentCondition(final int sinceVersion, final uk.co.real_logic.sbe.ir.Encoding encoding, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((((((((indent + "        if (actingVersion < %d)\n") + indent) + "        {\n") + indent) + "            return %s;\n") + indent) + "        }\n\n"), sinceVersion, generateLiteral(encoding.primitiveType(), encoding.applicableNullValue().toString()));
}