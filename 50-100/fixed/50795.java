public java.util.Set<java.lang.String> readKeyReferences(com.hp.hpl.jena.query.Dataset dataset) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {
    java.util.Set<java.lang.String> keyRefs = new java.util.HashSet<>();
    for (java.lang.String name : won.protocol.util.RdfUtils.getModelNames(dataset)) {
        readKeyReferences(dataset.getNamedModel(name), name, keyRefs);
    }
    return keyRefs;
}