@mockit.internal.state.Nullable
private static java.lang.String getReturnTypeIfCascadingSupportedForIt(@mockit.internal.state.Nonnull
java.lang.String typeDesc) {
    java.lang.String typeName = typeDesc.substring(1, ((typeDesc.length()) - 1));
    return mockit.internal.state.MockedTypeCascade.isTypeSupportedForCascading(typeName) ? typeName : null;
}