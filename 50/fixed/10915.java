public void writeTypeParameters(final java.lang.Iterable<com.strobel.decompiler.languages.java.TypeParameterDeclaration> typeParameters) {
    if (any(typeParameters)) {
        writeToken(Roles.LEFT_CHEVRON);
        writeCommaSeparatedList(typeParameters);
        writeToken(Roles.RIGHT_CHEVRON);
    }
}