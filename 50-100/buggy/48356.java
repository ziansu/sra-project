private org.eclipse.jgit.transport.CredentialsProvider getCredentialsProvider() {
    java.util.Map<java.lang.String, java.lang.String> properties = getDataStoreProperties();
    java.lang.String username;
    java.lang.String password;
    if (isExternalGitConfigured(properties)) {
        username = getExternalUser(properties);
        password = getExternalCredential(properties);
    }else {
        io.fabric8.api.RuntimeProperties sysprops = runtimeProperties.get();
        username = io.fabric8.zookeeper.utils.ZooKeeperUtils.getContainerLogin(sysprops);
        password = io.fabric8.zookeeper.utils.ZooKeeperUtils.generateContainerToken(sysprops, curator.get());
    }
    return new org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider(username, password);
}