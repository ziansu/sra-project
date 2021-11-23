private java.lang.CharSequence generateFieldNotPresentCondition(final int sinceVersion, final uk.co.real_logic.sbe.ir.Encoding encoding, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((((indent + "        if self.actingVersion_ < %1$d:\n") + indent) + "            return %2$s\n\n"), sinceVersion, generateLiteral(encoding.primitiveType(), encoding.applicableNullValue().toString()));
}