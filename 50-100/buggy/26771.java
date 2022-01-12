private org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider getCredentialsProvider(com.sillelien.github.GHMyself myself) throws java.io.IOException {
    java.util.Properties props = new java.util.Properties();
    java.io.File homeDir = new java.io.File(java.lang.System.getProperty("user.home"));
    try (java.io.FileInputStream in = new java.io.FileInputStream(new java.io.File(homeDir, ".github"))) {
        props.load(in);
    }
    return new org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider(props.getProperty("login"), props.getProperty("password"));
}