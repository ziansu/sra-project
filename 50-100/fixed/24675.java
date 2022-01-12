public void setPreferredFacet(org.opentravel.schemacompiler.model.TLFacetOwner entity, org.opentravel.schemacompiler.model.TLFacet preferredFacet) {
    javax.xml.namespace.QName entityName = new javax.xml.namespace.QName(entity.getNamespace(), entity.getLocalName());
    if (entity instanceof org.opentravel.schemacompiler.model.TLOperation) {
        throw new java.lang.IllegalArgumentException("Operation facets are not part of substitution groups.");
    }
    preferredFacetMap.put(entityName, preferredFacet);
}