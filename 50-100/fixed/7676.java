public java.lang.Long getSupportId(java.lang.String literal, java.lang.Long citationId) throws org.ndexbio.model.exceptions.NdexException {
    org.ndexbio.common.models.object.network.RawSupport r = new org.ndexbio.common.models.object.network.RawSupport(literal, (citationId != null ? citationId.longValue() : -1));
    java.lang.Long supportId = this.rawSupportMap.get(r);
    if (supportId != null)
        return supportId;
    
    supportId = createSupport(literal, citationId, null);
    this.rawSupportMap.put(r, supportId);
    return supportId;
}