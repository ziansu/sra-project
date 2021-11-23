public org.vitrivr.cineast.core.db.MultimediaObjectLookup.MultimediaObjectDescriptor lookUpObjectById(java.lang.String objectId) {
    java.util.List<java.util.Map<java.lang.String, org.vitrivr.cineast.core.data.providers.primitive.PrimitiveTypeProvider>> result = selector.getRows("id", objectId);
    if (result.isEmpty()) {
        return new org.vitrivr.cineast.core.db.MultimediaObjectLookup.MultimediaObjectDescriptor();
    }
    return mapToDescriptor(result.get(1));
}