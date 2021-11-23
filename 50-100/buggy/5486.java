private com.mgs.reflections.ParsedType parse(com.mgs.reflections.TypeResolution typeResolution, java.util.Map<java.lang.String, com.mgs.reflections.Declaration> effectiveParameters) {
    com.mgs.reflections.Declaration ownDeclaration = null;
    java.util.Optional<java.lang.String> genericName = typeResolution.getGenericName();
    if (genericName.isPresent()) {
        ownDeclaration = effectiveParameters.get(genericName.get());
    }
    if (ownDeclaration == null) {
        ownDeclaration = buildDeclaration(typeResolution, effectiveParameters);
    }
    return parse(ownDeclaration);
}