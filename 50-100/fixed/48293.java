private org.csiro.igsn.jaxb.oai.bindings.igsn.IdentifierType mapIdentifierType(java.lang.String fromValue) {
    java.lang.String trimedFromValue = fromValue.substring(((fromValue.lastIndexOf("/")) + 1), fromValue.length());
    if ((trimedFromValue.equalsIgnoreCase("url")) || (trimedFromValue.equalsIgnoreCase("urn"))) {
        return IdentifierType.URI;
    }else {
        return org.csiro.igsn.jaxb.oai.bindings.igsn.IdentifierType.fromValue(trimedFromValue);
    }
}