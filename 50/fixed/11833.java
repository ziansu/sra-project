private void yarnCommand(org.apache.zeppelin.helium.FrontendPluginFactory fpf, java.lang.String args, java.util.Map<java.lang.String, java.lang.String> env) throws org.apache.zeppelin.helium.TaskRunnerException {
    org.apache.zeppelin.helium.YarnRunner yarn = fpf.getYarnRunner(getProxyConfig(), defaultNpmRegistryUrl);
    yarn.execute(args, env);
}