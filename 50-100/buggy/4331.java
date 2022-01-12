@java.lang.Override
protected org.opencb.commons.datastore.core.QueryResult updateStudyConfiguration(org.opencb.opencga.storage.core.metadata.StudyConfiguration studyConfiguration, org.opencb.commons.datastore.core.QueryOptions options) {
    long startTime = java.lang.System.currentTimeMillis();
    java.nio.file.Path path = getPath(studyConfiguration.getStudyId(), options);
    try {
        org.opencb.opencga.storage.core.metadata.FileStudyConfigurationAdaptor.write(studyConfiguration, path);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return new org.opencb.commons.datastore.core.QueryResult();
}