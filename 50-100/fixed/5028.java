private java.lang.Object parsePremisToMetadata(java.lang.String pathToPremis) throws java.io.IOException {
    java.lang.Object o = null;
    try {
        o = new de.uzk.hki.da.model.ObjectPremisXmlReader().deserialize(new java.io.File(pathToPremis));
    } catch (java.text.ParseException e) {
        throw new java.lang.RuntimeException("error while parsing premis file", e);
    }
    return o;
}