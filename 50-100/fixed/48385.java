private org.molgenis.data.Entity upsert(org.molgenis.data.mapping.model.AttributeMapping attributeMapping) {
    org.molgenis.data.Entity result;
    if ((attributeMapping.getIdentifier()) == null) {
        attributeMapping.setIdentifier(idGenerator.generateId().toString());
        result = toAttributeMappingEntity(attributeMapping);
        repository.add(result);
    }else {
        result = toAttributeMappingEntity(attributeMapping);
        repository.update(result);
    }
    return result;
}