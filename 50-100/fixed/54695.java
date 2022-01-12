public static java.lang.Integer runCli(java.util.List<java.lang.String> args, java.util.Properties properties, java.lang.String workingDir) throws java.lang.Exception {
    java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
    for (final java.lang.String name : properties.stringPropertyNames()) {
        params.put(name, properties.getProperty(name));
    }
    return org.commonjava.maven.ext.manip.CliTestUtils.runCli(args, params, workingDir);
}