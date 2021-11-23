public static biocode.fims.digester.Entity getEntityRoot(biocode.fims.digester.Mapping mapping, java.lang.String uri) {
    java.util.ArrayList<biocode.fims.digester.Entity> entitiesWithAttribute = mapping.getEntititesWithAttributeUri(uri);
    if ((entitiesWithAttribute.size()) == 0) {
        throw new biocode.fims.fimsExceptions.ServerErrorException("Server Error", "No entity was found containing a urn:sequence attribute");
    }
    return entitiesWithAttribute.get(0);
}