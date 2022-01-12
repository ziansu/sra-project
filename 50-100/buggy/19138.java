@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{associatedTopicInstanceId}/associations/{topicInstanceId}")
public java.util.List<de.btu.openinfra.backend.db.pojos.TopicInstanceAssociationPojo> getAssociation(@javax.ws.rs.QueryParam(value = "language")
java.lang.String language, @javax.ws.rs.PathParam(value = "projectId")
java.util.UUID projectId, @javax.ws.rs.PathParam(value = "associatedTopicInstanceId")
java.util.UUID associatedTopicInstanceId, @javax.ws.rs.PathParam(value = "topicInstanceId")
java.util.UUID topicInstanceId, @javax.ws.rs.PathParam(value = "offset")
int offset, @javax.ws.rs.PathParam(value = "size")
int size) {
    return new de.btu.openinfra.backend.db.daos.TopicInstanceAssociationDao(projectId, de.btu.openinfra.backend.db.daos.OpenInfraSchemas.PROJECTS).read(de.btu.openinfra.backend.db.daos.PtLocaleDao.forLanguageTag(language), associatedTopicInstanceId, topicInstanceId, offset, size);
}