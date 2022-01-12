private java.util.Optional<java.lang.String> resolveName(java.lang.String clazz) {
    if (clazz.equals(entity))
        return java.util.Optional.of("Entity");
    
    nl.matsv.paaaas.module.modules.metadata.ClassNode entityTypesNode = classes.get(entityTypes);
    nl.matsv.paaaas.module.modules.metadata.InvokeClassStringExtractor extractor = new nl.matsv.paaaas.module.modules.metadata.InvokeClassStringExtractor(clazz, entityTypes);
    entityTypesNode.accept(extractor);
    if ((extractor.getFoundName()) == null)
        return java.util.Optional.empty();
    
    return java.util.Optional.of(extractor.getFoundName());
}