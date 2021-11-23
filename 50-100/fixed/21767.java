public static org.bbop.apollo.gwt.shared.projection.MultiSequenceProjection getProjectionForString(java.lang.String projectionString) {
    java.lang.Integer index = projectionString.lastIndexOf(":");
    if (index > 0) {
        projectionString = projectionString.substring(0, index);
    }
    org.bbop.apollo.gwt.client.projection.JSONObject projectionObject = org.bbop.apollo.gwt.client.projection.JSONParser.parseStrict(projectionString).isObject();
    org.bbop.apollo.gwt.client.projection.AssemblageInfo assemblageInfo = org.bbop.apollo.gwt.client.projection.AssemblageInfoConverter.convertJSONObjectToAssemblageInfo(projectionObject);
    return org.bbop.apollo.gwt.client.projection.ProjectionService.createProjectionFromAssemblageInfo(assemblageInfo);
}