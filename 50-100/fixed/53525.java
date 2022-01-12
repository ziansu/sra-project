public org.vitrivr.cineast.core.db.MultimediaObjectLookup.MultimediaObjectDescriptor lookUpObjectByName(java.lang.String name) {
    java.util.List<java.util.Map<java.lang.String, org.vitrivr.cineast.core.data.providers.primitive.PrimitiveTypeProvider>> result = selector.getRows("name", name);
    if (result.isEmpty()) {
        return new org.vitrivr.cineast.core.db.MultimediaObjectLookup.MultimediaObjectDescriptor();
    }
    return mapToDescriptor(result.get(0));
}