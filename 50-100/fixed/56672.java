@java.lang.Override
@org.restlet.resource.Post
public org.restlet.representation.Representation post(org.restlet.representation.Representation entity) {
    final java.lang.String tableName = ((java.lang.String) (getRequest().getAttributes().get("tableName")));
    try {
        return rebuildBrokerResourceFromHelixTags(tableName);
    } catch (java.lang.Exception e) {
        setStatus(Status.SERVER_ERROR_INTERNAL);
        return com.linkedin.pinot.controller.api.restlet.resources.PinotSegmentUploadRestletResource.exceptionToStringRepresentation(e);
    }
}