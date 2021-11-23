public java.util.List<de.btu.openinfra.backend.db.pojos.TopicGeomzPojo> read(de.btu.openinfra.backend.db.rbac.OpenInfraHttpMethod httpMethod, javax.ws.rs.core.UriInfo uriInfo, java.util.Locale locale, java.util.UUID topicCharacteristicId, int offset, int size) {
    new de.btu.openinfra.backend.db.rbac.TopicInstanceRbac(currentProjectId, schema).checkPermission(httpMethod, uriInfo);
    return new de.btu.openinfra.backend.db.daos.TopicGeomzDao(topicCharacteristicId, schema, geomType).read(locale, topicCharacteristicId, offset, size);
}