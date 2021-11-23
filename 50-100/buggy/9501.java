protected com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> _findExplicitUntypedSerializer(java.lang.Class<?> runtimeType) throws com.fasterxml.jackson.databind.JsonMappingException {
    com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> ser = _knownSerializers.untypedValueSerializer(runtimeType);
    if (ser == null) {
        ser = _serializerCache.untypedValueSerializer(runtimeType);
        if (ser == null) {
            ser = _createAndCacheUntypedSerializer(runtimeType);
            if (isUnknownTypeSerializer(ser)) {
                return null;
            }
        }
    }
    return ser;
}