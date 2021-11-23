private com.google.common.base.Optional<java.lang.Boolean> isParameterNonnull(com.sun.tools.javac.code.Symbol.VarSymbol parameter, com.google.errorprone.VisitorState state) {
    return isParameterNonnull(getTypeQualifiers(parameter, javax.annotation.Nonnull.class));
}