@mockit.internal.state.NotNull
private static java.lang.String getInternalTypeName(@mockit.internal.state.NotNull
java.lang.String typeDesc) {
    int p = typeDesc.indexOf('(');
    return typeDesc.substring((p + 2), ((typeDesc.length()) - 1));
}