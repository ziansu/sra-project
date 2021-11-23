public java.util.List<jenkins.plugins.coverity.StreamDataObj> getStaticStreams(java.lang.String projectId) throws java.io.IOException, jenkins.plugins.coverity.CovRemoteServiceException_Exception {
    jenkins.plugins.coverity.ProjectDataObj project = getProject(projectId);
    java.util.List<jenkins.plugins.coverity.StreamDataObj> result = new java.util.ArrayList<jenkins.plugins.coverity.StreamDataObj>();
    if (project != null) {
        for (jenkins.plugins.coverity.StreamDataObj stream : project.getStreams()) {
            if (!(stream.getId().getName().matches(jenkins.plugins.coverity.CIMInstance.STREAM_NAME_IGNORE_PATTERN))) {
                result.add(stream);
            }
        }
    }
    return result;
}