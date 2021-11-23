private boolean checkProvider(java.lang.String name, org.vitrivr.cineast.core.data.providers.primitive.PrimitiveTypeProvider provider, org.vitrivr.cineast.core.data.providers.primitive.ProviderDataType expectedType) {
    if (provider == null) {
        org.vitrivr.cineast.core.db.MultimediaObjectLookup.LOGGER.error("no {} in multimedia object", name);
        return false;
    }
    if ((provider.getType()) != expectedType) {
        org.vitrivr.cineast.core.db.MultimediaObjectLookup.LOGGER.error("invalid data type for field {} in multimedia object, expected {}, got {}", name, expectedType, provider.getType());
        return false;
    }
    return true;
}