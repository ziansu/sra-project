private com.kylinolap.invertedindex.model.IIDesc loadIIDesc(java.lang.String path) throws java.io.IOException {
    com.kylinolap.common.persistence.ResourceStore store = getStore();
    com.kylinolap.invertedindex.IIDescManager.logger.debug(("Loading IIDesc " + (store.getReadableResourcePath(path))));
    com.kylinolap.invertedindex.model.IIDesc ndesc = store.getResource(path, com.kylinolap.invertedindex.model.IIDesc.class, com.kylinolap.invertedindex.IIDescManager.II_DESC_SERIALIZER);
    if (org.apache.commons.lang3.StringUtils.isBlank(ndesc.getName())) {
        throw new java.lang.IllegalStateException("IIDesc name must not be blank");
    }
    ndesc.init(getMetadataManager());
    return ndesc;
}