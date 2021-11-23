private hudson.EnvVars getEnvVars() throws java.io.IOException, java.lang.InterruptedException {
    if ((envVars) == null) {
        envVars = new hudson.EnvVars(build.getEnvironment(listener)).overrideAll(dockerEnv.env());
    }
    return envVars;
}