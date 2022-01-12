private org.csiro.igsn.jaxb.oai.bindings.igsn.RelationType mapRelationType(java.lang.String relationType) {
    java.lang.String trimedrelationType = relationType.substring(relationType.lastIndexOf("/"), relationType.length());
    try {
        return org.csiro.igsn.jaxb.oai.bindings.igsn.RelationType.fromValue(trimedrelationType);
    } catch (java.lang.Exception e) {
        return null;
    }
}