public int getNextBuildNumber(com.groupon.jenkins.dynamic.build.repository.DynamicProject project) {
    com.groupon.jenkins.dynamic.build.repository.BuildNumberCounter seq = getDatastore().createQuery(com.groupon.jenkins.dynamic.build.repository.BuildNumberCounter.class).field("key").equal(project.getFullName()).get();
    if (seq == null) {
        return 1;
    }
    return seq.getCounter();
}