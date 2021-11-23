private java.lang.CharSequence generateFieldNotPresentCondition(final int sinceVersion, final uk.co.real_logic.sbe.ir.Encoding encoding, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((indent + "        if (_actingVersion < %1$d) return %2$s;\n\n"), sinceVersion, (sinceVersion > 0 ? generateLiteral(encoding.primitiveType(), encoding.applicableNullValue().toString()) : "(byte)0"));
}