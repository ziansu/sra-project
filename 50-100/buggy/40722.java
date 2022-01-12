private java.lang.Object parsePremisToMetadata(java.io.File premis) throws java.io.IOException {
    logger.debug(("reading rights from " + premis));
    java.lang.Object o = null;
    try {
        o = new de.uzk.hki.da.model.ObjectPremisXmlReader().deserialize(premis);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Error while deserializing PREMIS", e);
    }
    return o;
}