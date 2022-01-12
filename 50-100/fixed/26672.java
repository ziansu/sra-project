@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{valueListId}/associations/{associatedValueListId}")
public java.util.List<de.btu.openinfra.backend.db.pojos.ValueListAssociationPojo> getAssociations(@javax.ws.rs.QueryParam(value = "language")
java.lang.String language, @javax.ws.rs.PathParam(value = "projectId")
java.util.UUID projectId, @javax.ws.rs.PathParam(value = "schema")
java.lang.String schema, @javax.ws.rs.PathParam(value = "valueListId")
java.util.UUID valueListId, @javax.ws.rs.PathParam(value = "associatedValueListId")
java.util.UUID associatedValueListId, @javax.ws.rs.QueryParam(value = "offset")
int offset, @javax.ws.rs.QueryParam(value = "size")
int size) {
    return new de.btu.openinfra.backend.db.daos.ValueListAssociationDao(projectId, de.btu.openinfra.backend.db.daos.OpenInfraSchemas.valueOf(schema.toUpperCase())).read(de.btu.openinfra.backend.db.daos.PtLocaleDao.forLanguageTag(language), valueListId, associatedValueListId, offset, size);
}