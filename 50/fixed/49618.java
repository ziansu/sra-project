public <T> T map(final java.lang.Object srcObj, final java.lang.Class<T> destClass, final java.lang.String mapId) {
    org.dozer.util.MappingValidator.validateMappingRequest(srcObj, destClass);
    return mapGeneral(srcObj, destClass, null, mapId, null);
}