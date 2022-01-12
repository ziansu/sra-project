public void setPreferredFacet(org.opentravel.schemacompiler.model.TLFacetOwner entity, org.opentravel.schemacompiler.model.TLFacet preferredFacet) {
    javax.xml.namespace.QName entityName = new javax.xml.namespace.QName(entity.getNamespace(), entity.getLocalName());
    if (entity instanceof org.opentravel.schemacompiler.model.TLOperation) {
        throw new java.lang.IllegalArgumentException("Operation facets are not part of substitution groups.");
    }
    if ((preferredFacet.getFacetType()) == (org.opentravel.schemacompiler.model.TLFacetType.QUERY)) {
        throw new java.lang.IllegalArgumentException("Query facets are not part of the substitution group for a business object.");
    }
    preferredFacetMap.put(entityName, preferredFacet);
}