private java.lang.String parseIdentity() throws com.guardtime.ksi.exceptions.KSIException {
    java.lang.String identity = "";
    for (int i = (aggregationChains.size()) - 1; i >= 0; i--) {
        com.guardtime.ksi.unisignature.inmemory.InMemoryAggregationHashChain chain = aggregationChains.get(i);
        java.lang.String id = chain.getChainIdentity();
        if ((id.length()) > 0) {
            if ((identity.length()) > 0) {
                identity += com.guardtime.ksi.unisignature.inmemory.InMemoryKsiSignature.IDENTITY_SEPARATOR;
            }
            identity += id;
        }
    }
    return identity;
}